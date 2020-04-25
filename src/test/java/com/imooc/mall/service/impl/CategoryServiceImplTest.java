package com.imooc.mall.service.impl;

import com.imooc.mall.MallApplicationTests;
import com.imooc.mall.enums.ResponseEnum;
import com.imooc.mall.service.ICategoryService;
import com.imooc.mall.vo.CategoryVo;
import com.imooc.mall.vo.ResponseVo;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashSet;
import java.util.List;

/**
 * @author Zixu Jiang
 * @date 4/21/20 2:27 PM
 */
@Slf4j
public class CategoryServiceImplTest extends MallApplicationTests {

    @Autowired
    private ICategoryService categories;

    @Test
    public void selectAll() {
        ResponseVo<List<CategoryVo>> responseVo = categories.selectAll();
        Assert.assertEquals(ResponseEnum.SUCCESS.getCode(), responseVo.getStatus());
    }

    @Test
    public void findByCategoryId() {
        HashSet<Integer> set = new HashSet<>();
        categories.findSubCategoryId(100001, set);
        log.info("set={}", set);
    }
}