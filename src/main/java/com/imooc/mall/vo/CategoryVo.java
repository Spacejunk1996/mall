package com.imooc.mall.vo;

import lombok.Data;

import java.util.List;

/**
 * @author Zixu Jiang
 * @date 4/20/20 5:30 PM
 */
@Data
public class CategoryVo {

    private Integer id;

    private Integer parentId;

    private String name;

    private Integer sortOrder;

    private List<CategoryVo> subCategorise;
}
