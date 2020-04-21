package com.imooc.mall.service.impl;

import com.imooc.mall.MallApplicationTests;
import com.imooc.mall.enums.ResponseEnum;
import com.imooc.mall.service.ICategories;
import com.imooc.mall.vo.CategoryVo;
import com.imooc.mall.vo.ResponseVo;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author Zixu Jiang
 * @date 4/21/20 2:27 PM
 */
public class CategoryServiceImplTest extends MallApplicationTests {

    @Autowired
    private ICategories categories;

    @Test
    public void selectAll() {
        ResponseVo<List<CategoryVo>> responseVo = categories.selectAll();
        Assert.assertEquals(ResponseEnum.SUCCESS.getCode(), responseVo.getStatus());
    }
}