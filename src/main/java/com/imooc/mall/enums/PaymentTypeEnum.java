package com.imooc.mall.enums;

import lombok.Getter;

/**
 * @author Zixu Jiang
 * @date 5/4/20 5:15 PM
 */
@Getter
public enum PaymentTypeEnum {

    PAY_ONLINE(1),

    ;

    Integer code;

    PaymentTypeEnum(Integer code) {
        this.code = code;
    }
}
