package com.chakura.timemaster.dao;

import com.chakura.timemaster.entity.Category;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import org.springframework.stereotype.Repository;


@Repository
@Mapper
public interface CategoryDao extends BaseMapper<Category> {
	
}
