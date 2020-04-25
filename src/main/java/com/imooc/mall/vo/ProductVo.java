package com.imooc.mall.vo;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author Zixu Jiang
 * @date 4/23/20 2:35 PM
 */
@Data
public class ProductVo {
    private Integer id;

    private Integer categoryId;

    private String name;

    private String subtitle;

    private String mainImage;

    private Integer status;

    private BigDecimal price;
}
