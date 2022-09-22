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
		ItemDTO item = new ItemDTO(110, (Integer) null, "갤럭시s8", "삼성", 250000, null, "양호");  //형변환??(Integer)

		try {
			this.service.register(item);
		} catch (Exception var3) {
			var3.printStackTrace();
		}

	}
}