package com.multi.cust;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.CustDTO;
import com.multi.service.CustService;

@SpringBootTest
public class InsertCust {

	@Autowired
	CustService service;
	
	@Test
	void contextLoads() { 
		CustDTO cust = new CustDTO("id06", 6, "7777", "별", "01021213434", new Date("Thu, 17 Feb 1980 00:00:00 +0900"), "star01@naver.com");
		try {
			service.register(cust);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
