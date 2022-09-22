package com.multi.mapper;

import java.util.List;

import com.multi.dto.CartDTO;
import com.multi.frame.MyMapper;

public interface CartMapper extends MyMapper<Integer, CartDTO> {
	public List<CartDTO> cartall(String cust_id) throws Exception;
}