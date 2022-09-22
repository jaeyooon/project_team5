package com.multi.mapper;

import java.util.List;

import com.multi.dto.ItemDTO;
import com.multi.frame.MyMapper;

public interface ItemMapper extends MyMapper<Integer, ItemDTO> {
	public List<ItemDTO> itemall(int cateid) throws Exception;
}
