package com.imooc.mall.form;

import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * @author Zixu Jiang
 * @date 4/13/20 6:13 PM
 */
@Data
public class UserLoginForm {

    @NotBlank
    private String username;

    @NotBlank
    private String password;
}
