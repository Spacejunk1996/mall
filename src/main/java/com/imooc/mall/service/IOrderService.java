package com.imooc.mall.service;

import com.imooc.mall.vo.OrderVo;
import com.imooc.mall.vo.ResponseVo;

/**
 * @author Zixu Jiang
 * @date 5/3/20 1:34 PM
 */
public interface IOrderService {

    ResponseVo<OrderVo> create(Integer uid, Integer shippingId);
}
