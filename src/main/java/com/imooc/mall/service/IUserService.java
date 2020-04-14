package com.imooc.mall.service;

import com.imooc.mall.pojo.User;
import com.imooc.mall.vo.ResponseVo;

/**
 * @author Zixu Jiang
 * @date 4/10/20 5:52 PM
 */
public interface IUserService {

    /**
     * 注册
     * */
    ResponseVo<User> register(User user);

    ResponseVo<User> login(String username, String password);
}
