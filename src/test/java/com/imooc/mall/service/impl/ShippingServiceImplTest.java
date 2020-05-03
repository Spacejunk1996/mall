package com.imooc.mall.service.impl;

import com.imooc.mall.MallApplicationTests;
import com.imooc.mall.enums.ResponseEnum;
import com.imooc.mall.form.ShippingForm;
import com.imooc.mall.service.IShippingService;
import com.imooc.mall.vo.ResponseVo;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;

/**
 * @author Zixu Jiang
 * @date 5/1/20 2:12 PM
 */
@Slf4j
public class ShippingServiceImplTest extends MallApplicationTests {

    @Autowired
    private IShippingService shippingService;

    private Integer uid = 1;

    private ShippingForm form;

    @Before
    public void doBefore() {
        form = new ShippingForm();
        form.setReceiverName("测试");
        form.setReceiverPhone("123456");
        form.setReceiverMobile("123455");
        form.setReceiverProvince("北京");
        form.setReceiverCity("北京市");
        form.setReceiverDistrict("东城区");
        form.setReceiverAddress("测试地址");
        form.setReceiverZip("123456");
        this.form = form;
    }

    @Test
    public void add() {
        ResponseVo<Map<String, Integer>> responseVo = shippingService.add(uid, form);
        log.info("responseVo={}", responseVo);
        Assert.assertEquals(ResponseEnum.SUCCESS.getCode(), responseVo.getStatus());
    }

    @Test
    public void delete() {
        ResponseVo responseVo = shippingService.delete(uid, 7);
        log.info("responseVo={}", responseVo);
    }

    @Test
    public void update() {
        form.setReceiverDistrict("西城区");
        ResponseVo responseVo = shippingService. update(uid, 9, form);
        log.info("responseVo={}", responseVo);
        Assert.assertEquals(ResponseEnum.SUCCESS.getCode(), responseVo.getStatus());
    }

    @Test
    public void list() {
        ResponseVo responseVo = shippingService.list(uid, 1, 10);
        log.info("responseVo={}", responseVo);
        Assert.assertEquals(ResponseEnum.SUCCESS.getCode(), responseVo.getStatus());
    }
}