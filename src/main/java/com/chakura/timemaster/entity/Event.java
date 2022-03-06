package com.chakura.timemaster.entity;

import com.baomidou.mybatisplus.annotation.*;

import java.util.Date;
import lombok.Data;

@Data
@TableName("event")
public class Event {

	@TableId(type = IdType.AUTO)
	private Integer id;
	private String uuid;
	private String name;
	private Integer userId;
	private String ringtoneId;
	private String notificationMsg;
	private String location;
	private String description;
	private Date startTime;
	private Date endTime;
	@TableField(fill = FieldFill.INSERT)
	private Date createTime;
	@TableField(fill = FieldFill.UPDATE)
	private Date modifyTime;

}
