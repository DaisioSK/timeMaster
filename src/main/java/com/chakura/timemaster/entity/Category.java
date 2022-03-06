package com.chakura.timemaster.entity;

import com.baomidou.mybatisplus.annotation.*;

import java.util.Date;
import lombok.Data;

@Data
@TableName("category")
public class Category {

	@TableId(type = IdType.AUTO)
	private Integer id;
	private String name;
	private Integer userId;
	@TableField(fill = FieldFill.INSERT)
	private Date createTime;

}
