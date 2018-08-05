package com.ordering.mapper;

import com.ordering.po.Shore;
import com.ordering.po.ShoreCustom;
import com.ordering.po.ShoreExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShoreMapper {
    int countByExample(ShoreExample example);

    int deleteByExample(ShoreExample example);

    int deleteByPrimaryKey(Integer shoreid);

    int insert(Shore record);

    int insertSelective(Shore record);

    List<Shore> selectByExample(ShoreExample example);

    Shore selectByPrimaryKey(Integer shoreid);

    int updateByExampleSelective(@Param("record") Shore record, @Param("example") ShoreExample example);

    int updateByExample(@Param("record") Shore record, @Param("example") ShoreExample example);

    int updateByPrimaryKeySelective(Shore record);

    int updateByPrimaryKey(Shore record);

    Shore check(String username);

	ShoreCustom selectShore(Shore shore);
	
	ShoreCustom selectShoreById(Shore shore);
	
	void updateShore(Shore shore);
	
	void updateShoreImg(Shore shore);
	
	List<Shore> selectAllShore();
	
	List<Shore> findShoreByType(int shoretypeid);

	ShoreCustom selectShoreByPrimaryKey(int shoreid);
	
	
}