package com.chakura.timemaster.entity;

import com.baomidou.mybatisplus.annotation.*;

import java.util.Date;
import lombok.Data;

@Data
@TableName("access_log")
public class AccessLog {

	@TableId(type = IdType.AUTO)
	private Long id;
	private String accessUrl;
	private String ipAddr;
	private Integer userId;
	private String username;
	@TableField(fill = FieldFill.INSERT)
	private Date accessTime;
}
