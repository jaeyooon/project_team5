package com.multi.ordertbl;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.OrdertblDTO;
import com.multi.service.OrdertblService;

@SpringBootTest
public class InsertOrdertbl {

	@Autowired
	OrdertblService service;
	
	@Test
	void contextLoads() {
		try {
			service.register(new OrdertblDTO(1003, 115,"id04","ys",010,"강원도","2014-03-24",1, 20, 500000,"네이버페이"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("insert OK");
	}
}
