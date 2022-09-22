package com.multi.item;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.service.ItemService;

@SpringBootTest
public class DeleteItem {
	@Autowired
	ItemService service;
	
	void contextLoads() {
		try {
			service.remove(null);
		} catch (Exception var2) {
			var2.printStackTrace();
		}
	}
}
