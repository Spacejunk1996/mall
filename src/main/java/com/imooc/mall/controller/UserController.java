package com.imooc.mall.controller;

import com.imooc.mall.consts.MallConst;
import com.imooc.mall.enums.ResponseEnum;
import com.imooc.mall.form.UserLoginForm;
import com.imooc.mall.form.UserRegisterForm;
import com.imooc.mall.pojo.User;
import com.imooc.mall.service.IUserService;
import com.imooc.mall.vo.ResponseVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

/**
 * @author Zixu Jiang
 * @date 4/10/20 7:19 PM
 */
@RestController
@Slf4j
public class UserController {

    @Autowired
    private IUserService userService;

    @PostMapping("/user/register")
    public ResponseVo<User> register(@Valid @RequestBody UserRegisterForm userRegisterForm,
                               BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            log.error( "注册提交参数有误, {}", bindingResult.getFieldError().getDefaultMessage());
            return ResponseVo.error(ResponseEnum.PARAM_ERROR, bindingResult);
        }

        User user = new User();
        BeanUtils.copyProperties(userRegisterForm, user);

        return userService.register(user);
    }

    @PostMapping("/user/login")
    public ResponseVo<User> login(@Valid @RequestBody  UserLoginForm userLoginForm,
                                  BindingResult bindingResult,
                                  HttpSession session) {
        if (bindingResult.hasErrors()) {
            return ResponseVo.error(ResponseEnum.PARAM_ERROR, bindingResult);
        }

        ResponseVo<User> userResponseVo = userService.login(userLoginForm.getUsername(), userLoginForm.getPassword());

        //设置session
        session.setAttribute(MallConst.CURRENT_USER, userResponseVo.getData());

        return userResponseVo;
    }

//    @GetMapping("/user")


}
