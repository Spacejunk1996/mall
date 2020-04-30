package com.imooc.mall.service.impl;

import com.google.gson.Gson;
import com.imooc.mall.MallApplicationTests;
import com.imooc.mall.form.CartAddForm;
import com.imooc.mall.form.CartUpdateForm;
import com.imooc.mall.service.ICartService;
import com.imooc.mall.vo.CartVo;
import com.imooc.mall.vo.ResponseVo;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Zixu Jiang
 * @date 4/26/20 7:14 PM
 */
@Slf4j
public class CartServiceImplTest extends MallApplicationTests {

    @Autowired
    private ICartService cartService;

    @Autowired
    private Gson gson;

    @Test
    public void add() {
        CartAddForm form = new CartAddForm();
        form.setProductId(26);
        form.setSelected(true);
        cartService.add(1, form);
    }

    @Test
    public void list() {
        ResponseVo<CartVo> list = cartService.list(1);
        log.info("list={}", list);
    }

    @Test
    public void update() {
        CartUpdateForm form = new CartUpdateForm();
        form.setQuantity(5);
        form.setSelected(false);
        ResponseVo<CartVo> responseVo = cartService.update(1,26, form);
        log.info("list={}", gson.toJson(responseVo));
    }

    @Test
    public void delete() {
        ResponseVo<CartVo> responseVo = cartService.delete(1,27);
        log.info("list={}", gson.toJson(responseVo));
    }
}