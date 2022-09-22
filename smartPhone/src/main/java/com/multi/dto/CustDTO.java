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
public class CustDTO {
	private String custid;
	private int addrid;
	private String pwd;
	private String name;
	private String tel;
	private Date birth;
	private String email;
}
