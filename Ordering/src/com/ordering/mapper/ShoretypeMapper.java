package com.ordering.mapper;

import com.ordering.po.Shoretype;
import com.ordering.po.ShoretypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShoretypeMapper {
    int countByExample(ShoretypeExample example);

    int deleteByExample(ShoretypeExample example);

    int deleteByPrimaryKey(Integer shoretypeid);

    int insert(Shoretype record);

    int insertSelective(Shoretype record);

    List<Shoretype> selectByExample(ShoretypeExample example);

    Shoretype selectByPrimaryKey(Integer shoretypeid);

    int updateByExampleSelective(@Param("record") Shoretype record, @Param("example") ShoretypeExample example);

    int updateByExample(@Param("record") Shoretype record, @Param("example") ShoretypeExample example);

    int updateByPrimaryKeySelective(Shoretype record);

    int updateByPrimaryKey(Shoretype record);

	List<Shoretype> selectAllType();
}