package com.imooc.mall.service;

import com.imooc.mall.form.CartAddForm;
import com.imooc.mall.form.CartUpdateForm;
import com.imooc.mall.vo.CartVo;
import com.imooc.mall.vo.ResponseVo;

/**
 * @author Zixu Jiang
 * @date 4/26/20 2:25 PM
 */
public interface ICartService {

    ResponseVo<CartVo> add(Integer uid, CartAddForm cartAddForm);

    ResponseVo<CartVo> list(Integer uid);

    ResponseVo<CartVo> update(Integer uid, Integer productId, CartUpdateForm form);

    ResponseVo<CartVo> delete(Integer uid, Integer productId);
}
