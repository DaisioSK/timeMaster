package com.chakura.timemaster.dao;

import com.chakura.timemaster.entity.AccessLog;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import org.springframework.stereotype.Repository;


@Repository
@Mapper
public interface AccessLogDao extends BaseMapper<AccessLog> {
	
}
