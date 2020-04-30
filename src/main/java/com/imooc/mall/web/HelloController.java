package com.imooc.mall.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Zixu Jiang
 * @date 4/27/20 4:33 PM
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String Hello() {
        System.out.println("Hello");
        return "Hello";
    }
}
