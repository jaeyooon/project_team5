package com.multi.gitTest;

import java.util.Date;


//lombock 구현하려고 했으나 안 되시는 분들 있을까 싶어서 생성자 getter setter 만들어서 구현 하였읍니다. 
public class ItemManagement {
	private int itemid;
	private int cateid;
	private String pname;
	private String info;
	private int price;
	private Date mdate;
	private String checkstatus;
	
	//Constructor
	public ItemManagement(int itemid, int cateid, String pname, String info, int price, Date mdate,
			String checkstatus) {
		super();
		this.itemid = itemid;
		this.cateid = cateid;
		this.pname = pname;
		this.info = info;
		this.price = price;
		this.mdate = mdate;
		this.checkstatus = checkstatus;
	}
	
	//Getter & Setter
	public int getItemid() {
		return itemid;
	}
	public void setItemid(int itemid) {
		this.itemid = itemid;
	}
	public int getCateid() {
		return cateid;
	}
	public void setCateid(int cateid) {
		this.cateid = cateid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Date getMdate() {
		return mdate;
	}
	public void setMdate(Date mdate) {
		this.mdate = mdate;
	}
	public String getCheckstatus() {
		return checkstatus;
	}
	public void setCheckstatus(String checkstatus) {
		this.checkstatus = checkstatus;
	}
	
	//toString
	@Override
	public String toString() {
		return "ItemManagement [itemid=" + itemid + ", cateid=" + cateid + ", pname=" + pname + ", info=" + info
				+ ", price=" + price + ", mdate=" + mdate + ", checkstatus=" + checkstatus + "]";
	}
	
	
}
