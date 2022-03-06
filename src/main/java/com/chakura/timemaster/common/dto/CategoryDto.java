package com.chakura.timemaster.common.dto;
import lombok.Data;

import java.util.Date;

@Data
public class CategoryDto {

    private Integer id;
        private String name;
        private Integer userId;
        private Date createTime;
    }