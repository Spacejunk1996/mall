package com.imooc.mall.service;

import com.imooc.mall.vo.CategoryVo;
import com.imooc.mall.vo.ResponseVo;

import java.util.List;

/**
 * @author Zixu Jiang
 * @date 4/20/20 5:32 PM
 */
public interface ICategories {
    ResponseVo<List<CategoryVo>> selectAll();
}
