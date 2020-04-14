package com.imooc.mall.enums;

import lombok.Getter;

/**
 * @author Zixu Jiang
 * @date 4/10/20 6:56 PM
 */
@Getter
public enum  RoleEnum {

    ADMIN(0),

    CUSTOMER(1),
    ;
    Integer code;

    RoleEnum(Integer code) {
        this.code = code;
    }
}
