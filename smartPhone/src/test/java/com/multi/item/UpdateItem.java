package com.multi.item;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.ItemDTO;
import com.multi.service.ItemService;

@SpringBootTest
class UpdateItem {
	
	@Autowired
	ItemService service;
	
	@Test
	void contextLoads() {
		ItemDTO item = new ItemDTO(110, 2017-03-30, "갤럭시s8", "삼성", 250000, null, "양호");//아이템명, 카테고리명, 상품명, 브랜드명, 가격, 제조일, 상태 순이여야 하는데 왜 바뀌어 있을까요..?
		
		try {
			this.service.modify(item);
		} catch(Exception var3) {
			var3.printStackTrace();
		}
	}
}
