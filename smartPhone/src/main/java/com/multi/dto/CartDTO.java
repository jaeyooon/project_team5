package com.multi.dto;

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

public class CartDTO {
	private int cartid;
	private String cust_id;
	private int item_id;
	private int cnt;
	private String cust_name;
	private String item_pname;
	private int item_price;
}
