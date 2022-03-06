package com.chakura.timemaster.entity;

import com.baomidou.mybatisplus.annotation.*;

import java.util.Date;
import lombok.Data;

@Data
@TableName("event_log")
public class EventLog {

	@TableId(type = IdType.AUTO)
	private Long id;
	private String requestUrl;
	private String requestMethod;
	private String requestBody;
	private String operationType;
	private String ipAddr;
	private Integer userId;
	private String username;
	@TableField(fill = FieldFill.INSERT)
	private Date operateTime;
}
