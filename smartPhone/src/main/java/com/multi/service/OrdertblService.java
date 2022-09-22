package com.multi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.multi.dto.OrdertblDTO;
import com.multi.frame.MyService;
import com.multi.mapper.OrdertblMapper;

@Service
public class OrdertblService implements MyService<Integer, OrdertblDTO> {
	
	@Autowired
	OrdertblMapper mapper;

	@Override
	public void register(OrdertblDTO v) throws Exception {
		mapper.insert(v);
	}

	@Override
	public void remove(Integer k) throws Exception {
		mapper.delete(k);
	}

	@Override
	public void modify(OrdertblDTO v) throws Exception {
		mapper.update(v);
	}

	@Override
	public OrdertblDTO get(Integer k) throws Exception {
		return null;
	}

	@Override
	public List<OrdertblDTO> get() throws Exception {
		return mapper.selectall();
	}

}
