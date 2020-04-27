package com.imooc.mall.service;

import com.imooc.mall.form.CartAddForm;
import com.imooc.mall.vo.CartVo;
import com.imooc.mall.vo.ResponseVo;

/**
 * @author Zixu Jiang
 * @date 4/26/20 2:25 PM
 */
public interface ICartService {

    ResponseVo<CartVo> add(Integer uid, CartAddForm cartAddForm);
}
