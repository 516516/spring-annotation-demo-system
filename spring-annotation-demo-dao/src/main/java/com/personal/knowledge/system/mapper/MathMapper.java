package com.personal.knowledge.system.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MathMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Math record);

    int insertSelective(Math record);

    Math selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Math record);

    int updateByPrimaryKey(Math record);
}