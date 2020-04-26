package com.imooc.mall.vo;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author Zixu Jiang
 * @date 4/25/20 10:31 PM
 */
@Data
public class CartProductVo {

    private Integer productId;

    /**
     * 购买的数量
     */
    private Integer quantity;

    private String productName;

    private String productSubtitle;

    private String productMainImage;

    private BigDecimal productPrice;

    private Integer productStatus;

    private BigDecimal productTotalPrice;

    private Integer productStock;

    private Boolean productSelected;
}
