package com.chakura.timemaster.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.chakura.timemaster.entity.EventLog;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


@Repository
@Mapper
public interface EventLogDao extends BaseMapper<EventLog> {
	
}
