package com.chakura.timemaster.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("reln_event_category")
public class RelnEventCategory {

	private Integer eventId;
	private Integer categoryId;

}
