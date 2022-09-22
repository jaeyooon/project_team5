package com.multi.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.multi.dto.OrdertblDTO;
import com.multi.frame.MyMapper;

@Repository
@Mapper
public interface OrdertblMapper extends MyMapper<Integer, OrdertblDTO>{
	
}
