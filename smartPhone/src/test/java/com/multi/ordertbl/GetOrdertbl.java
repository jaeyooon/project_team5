package com.multi.ordertbl;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.OrdertblDTO;
import com.multi.service.OrdertblService;

@SpringBootTest
public class GetOrdertbl {

	@Autowired
	OrdertblService service;

	@Test
	void contextLoads() {
		OrdertblDTO ordertbl = null;
		try {
			ordertbl = service.get(1002);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(ordertbl);
	}

}
