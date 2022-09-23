package com.multi.cust;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.CustDTO;
import com.multi.service.CustService;

@SpringBootTest
public class UpdateCust {

	@Autowired
	CustService service;
	

	@Test
	void contextLoads() { // 1957-04-13
		CustDTO cust = new CustDTO("id02", 2, "5678", "박명수", "01077975589", new Date("Sat, 13 Apr 1957 00:00:00 +0900"), "sooi4749@naver.com");
		try {
			service.modify(cust);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
