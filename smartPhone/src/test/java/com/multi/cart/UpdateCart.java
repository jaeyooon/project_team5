package com.multi.cart;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.CartDTO;
import com.multi.service.CartService;

@SpringBootTest
class UpdateCart {
	
	@Autowired
	CartService service;
	
	@Test
	void contextLoads() {
		CartDTO cart = new CartDTO(20, "id08", 116, 6, "홍장미", "아이폰XS", 500000);
		try {
			service.modify(cart);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
