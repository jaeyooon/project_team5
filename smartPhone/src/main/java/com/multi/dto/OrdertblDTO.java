package com.multi.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class OrdertblDTO {
	private int orderid;
	private int itemid;
	private String custid;
	private String rname;
	private int phonenum;
	private String addr;
	private String odate;
	private int count;
	private int money;
	private int coupon;
	private String pay;
	
}
