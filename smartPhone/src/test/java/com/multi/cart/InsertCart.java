package com.multi.cart;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.CartDTO;
import com.multi.service.CartService;

@SpringBootTest
class InsertCart {
	
	@Autowired
	CartService service;
	
	@Test
	void contextLoads() {
		try {
			service.register(new CartDTO(21, "id031",112,3,null,null, 650000));
			System.out.println("OK");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}