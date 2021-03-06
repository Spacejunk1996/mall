package com.imooc.mall.service;

import com.imooc.mall.vo.CategoryVo;
import com.imooc.mall.vo.ResponseVo;

import java.util.List;
import java.util.Set;

/**
 * @author Zixu Jiang
 * @date 4/20/20 5:32 PM
 */
public interface ICategoryService {
    ResponseVo<List<CategoryVo>> selectAll();

    void findSubCategoryId(Integer categoryId, Set<Integer> resultSet);
}
