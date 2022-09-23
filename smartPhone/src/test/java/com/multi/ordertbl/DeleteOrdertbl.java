package com.multi.ordertbl;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.service.OrdertblService;

@SpringBootTest
public class DeleteOrdertbl {

	@Autowired
	OrdertblService service;

	@Test
	void contextLoad() {
		try {
			service.remove(1003);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("delete OK");
	}
}
