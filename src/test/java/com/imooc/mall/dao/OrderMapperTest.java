package com.imooc.mall.dao;

import com.imooc.mall.MallApplicationTests;
import com.imooc.mall.pojo.Order;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * @author Zixu Jiang
 * @date 1/30/20 3:30 PM
 */

public class OrderMapperTest extends MallApplicationTests {

    @Autowired
    private OrderMapper orderMapper;

    @Test
    public void deleteByPrimaryKey() {
    }

    @Test
    public void insert() {
    }

    @Test
    public void insertSelective() {
    }

    @Test
    public void selectByPrimaryKey() {
        Order order = orderMapper.selectByPrimaryKey(2);
        System.out.println(order.toString());
    }

    @Test
    public void updateByPrimaryKeySelective() {
    }

    @Test
    public void updateByPrimaryKey() {
    }
}
