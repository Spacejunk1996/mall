package com.imooc.mall.controller;

import com.imooc.mall.service.ICategories;
import com.imooc.mall.vo.CategoryVo;
import com.imooc.mall.vo.ResponseVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Zixu Jiang
 * @date 4/20/20 6:04 PM
 */
@RestController
public class CategoryController {

    @Autowired
    private ICategories categories;

    @GetMapping("/category")
    public ResponseVo<List<CategoryVo>> category() {
        return categories.selectAll();
    }
}
