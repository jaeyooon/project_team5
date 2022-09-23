package com.multi.item;

import com.multi.dto.ItemDTO;
import com.multi.service.ItemService;
import java.util.Date;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class InsertItem {
	@Autowired
	ItemService service;

	@Test
	void contextLoads() {
		ItemDTO item = new ItemDTO(108, 0 , "아이폰12", "애플", 210000, null, "양호");  //형변환??(Integer) null 두번째 안비우니까 제대로 됨.

		try {
			this.service.register(item);
		} catch (Exception var3) {
			var3.printStackTrace();
		}

	}
}