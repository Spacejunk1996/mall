package com.imooc.mall.pojo;

import lombok.Data;

/**
 * @author Zixu Jiang
 * @date 4/26/20 7:01 PM
 */
@Data
public class Cart {

    private Integer productId;

    private Integer quantity;

    private Boolean productSelected;

    public Cart() {

    }

    public Cart(Integer productId, Integer quantity, Boolean productSelected) {
        this.productId = productId;
        this.quantity = quantity;
        this.productSelected = productSelected;
    }
}
