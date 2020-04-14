package com.imooc.mall.service.impl;

import com.imooc.mall.dao.UserMapper;
import com.imooc.mall.enums.ResponseEnum;
import com.imooc.mall.enums.RoleEnum;
import com.imooc.mall.pojo.User;
import com.imooc.mall.service.IUserService;
import com.imooc.mall.vo.ResponseVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import java.nio.charset.StandardCharsets;

/**
 * @author Zixu Jiang
 * @date 4/10/20 5:56 PM
 */
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;

    /**
     * 注册
     * @param user
     */
    @Override
    public ResponseVo<User> register(User user) {
//        error();
        // username 不重复
        int countByUsername = userMapper.countByUsername(user.getUsername());
        if (countByUsername > 0) {
            return ResponseVo.error(ResponseEnum.USERNAME_EXIST);
        }
        // email 不重复
        int countByEmail = userMapper.countByEmail(user.getEmail());
        if (countByEmail > 0) {
            return ResponseVo.error(ResponseEnum.EMAIL_EXIST);
        }
        user.setRole(RoleEnum.CUSTOMER.getCode());
        // MD5
        user.setPassword(DigestUtils.md5DigestAsHex(user.getPassword().getBytes(StandardCharsets.UTF_8)));
        //写入数据库
        int resultCount = userMapper.insertSelective(user);
        if (resultCount == 0) {
            return ResponseVo.error(ResponseEnum.ERROR);
        }
        return ResponseVo.success();
    }

    /**
     * 登录
     * @param username
     * @param password
     * @return
     */
    @Override
    public ResponseVo<User> login(String username, String password) {
        User user = userMapper.selectByUsername(username);

        // 如果用户名为不存在 返回：用户名或密码错误
        if (user == null) {
            return ResponseVo.error(ResponseEnum.USERNAME_OR_PASSWORD_ERROR);
        }

        // 如果密码不匹配 返回：用户名或密码错误
        if (!user.getPassword().equals(DigestUtils.md5DigestAsHex(user.getPassword().getBytes(StandardCharsets.UTF_8)))) {
            return ResponseVo.error(ResponseEnum.USERNAME_OR_PASSWORD_ERROR);
        }

        return ResponseVo.success();
    }

    private void error() {
        throw new RuntimeException("意外错误");
    }
}
