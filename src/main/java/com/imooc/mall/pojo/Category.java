package com.imooc.mall.pojo;

import lombok.Data;

import java.util.Date;

/**
 * @author Zixu Jiang
 * @date 1/21/20 12:37 AM
 */
@Data
public class Category {

    private Integer id;

    private Integer parentId;

    private String name;

    private Integer status;

    private Integer sortOrder;

    private Date createTime;

    private Date updateTime;

}
