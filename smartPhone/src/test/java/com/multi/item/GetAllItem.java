package com.multi.item;

import com.multi.dto.ItemDTO;
import com.multi.service.ItemService;
import java.util.Iterator;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GetAllItem {
	@Autowired
	ItemService service;

	@Test
	void contextLoads() {
		List list = null;

		try {
			list = this.service.get();
		} catch (Exception var4) {
			var4.printStackTrace();
		}

		Iterator var3 = list.iterator();

		while (var3.hasNext()) {
			ItemDTO c = (ItemDTO) var3.next();
			System.out.println(c);
		}

	}
}