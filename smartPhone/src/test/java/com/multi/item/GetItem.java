package com.multi.item;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.multi.dto.ItemDTO;
import com.multi.service.ItemService;

public class GetItem {
	@Autowired
	ItemService service;
	
	@Test
	void contextLoads() {
		ItemDTO item = null;
		
		try {
			item  = this.service.get(111);
		} catch(Exception var3) {
			var3.printStackTrace();
		}
		
		System.out.println(item);
	}
}
