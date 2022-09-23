package com.multi.item;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.service.ItemService;

@SpringBootTest
public class DeleteItem {
	@Autowired
	ItemService service;
	
	@Test
	void contextLoads() {
		try {
			service.remove(111);
		} catch (Exception var2) {
			var2.printStackTrace();
		}
	}
}
