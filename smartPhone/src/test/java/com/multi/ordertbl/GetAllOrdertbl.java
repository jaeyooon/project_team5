package com.multi.ordertbl;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.OrdertblDTO;
import com.multi.service.OrdertblService;

@SpringBootTest
public class GetAllOrdertbl {

	@Autowired
	OrdertblService service;
	
	@Test
	void contextLoads() {
		List<OrdertblDTO> list = null;
		try {
			list = service.get();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		for(OrdertblDTO o:list) {
			System.out.println(o);
		}
	}
	
	
}
