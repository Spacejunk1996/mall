package com.imooc.mall.form;

import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * @author Zixu Jiang
 * @date 4/13/20 3:13 PM
 */

@Data
public class UserRegisterForm {

    // NotBlank 用于String判断空格
    // NotEmpty 用于集合
    // Notnull
    @NotBlank
    private String username;

    @NotBlank
    private String password;

    @NotBlank
    private String email;
}
