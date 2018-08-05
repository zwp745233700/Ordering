package com.ordering.mapper;

import com.ordering.po.Orders;
import com.ordering.po.OrdersExample;
import com.ordering.po.OrdersVo;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrdersMapper {
    int countByExample(OrdersExample example);

    int deleteByExample(OrdersExample example);

    int deleteByPrimaryKey(Integer orderid);

    int insert(Orders record);

    int insertSelective(Orders record);

    List<Orders> selectByExample(OrdersExample example);

    Orders selectByPrimaryKey(Integer orderid);

    int updateByExampleSelective(@Param("record") Orders record, @Param("example") OrdersExample example);

    int updateByExample(@Param("record") Orders record, @Param("example") OrdersExample example);

    int updateByPrimaryKeySelective(Orders record);

    int updateByPrimaryKey(Orders record);
    
    public OrdersVo findOrderById(int orderid);
    
    public List<OrdersVo> findOrderByShoreId(int shoreid);
    
    public List<OrdersVo> findOrderByuserId(int userid);
    
    public List<OrdersVo> findMyOrderByStatu1(int statu);
    
    public List<OrdersVo> findMyOrderByStatu2(int statu);

	List<OrdersVo> findOrdertailByOrderid(int orderId);
    
}