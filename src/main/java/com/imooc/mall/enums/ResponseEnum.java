package com.imooc.mall.enums;

import lombok.Getter;

/**
 * @author Zixu Jiang
 * @date 4/13/20 7:44 AM
 */
@Getter
public enum ResponseEnum {

    ERROR(-1,"服务端错误"),

    SUCCESS(0,"成功"),

    PASSWORD_ERROR(1, "密码错误"),

    USERNAME_EXIST(2,"用户已经存在"),

    PARAM_ERROR(3, "参数错误"),

    EMAIL_EXIST(4, "邮箱已经存在"),

    NEED_LOGIN(10,"需要登录"),

    USERNAME_OR_PASSWORD_ERROR(11, "用户名或密码错误"),

    PRODUCT_OFF_SALE_DELETE(12, "商品下架或删除"),

    PRODUCT_NOT_EXIT(13, "商品不存在"),

    PRODUCT_STOCK_ERROR(14, "商品库存不足"),

    CART_PRODUCT_NOT_EXIT(15, "购物车商品不存在"),

    DELETE_SHIPPING_FAIL(16, "删除地址失败"),

    ;

    Integer code;

    String desc;

    ResponseEnum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }
}
