package com.imooc.mall.form;

import lombok.Data;
import lombok.Getter;

/**
 * 购物车跟新商品
 * @author Zixu Jiang
 * @date 4/29/20 9:51 PM
 */
@Data
@Getter
public class CartUpdateForm {

    private Integer quantity;

    private Boolean selected;
}
