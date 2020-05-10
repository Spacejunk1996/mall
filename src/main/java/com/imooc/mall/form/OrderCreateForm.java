package com.imooc.mall.form;

import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * @author Zixu Jiang
 * @date 5/9/20 2:29 AM
 */
@Data
public class OrderCreateForm {

    @NotNull
    private Integer shippingId;
}
