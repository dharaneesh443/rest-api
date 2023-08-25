package com.skcet.JPQL.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "resort")
public class JPQLModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int hotelid;
	@Column(name = "hotelname")
	private String hotelname;
	@Column(name="hoteladdress")
	private String hoteladdress;
	@Column(name="hotelownerinfo")
	private String hotelownerinfo;
	public int getHotelid() {
		return hotelid;
	}
	public void setHotelid(int hotelid) {
		this.hotelid = hotelid;
	}
	public String getHotelname() {
		return hotelname;
	}
	public void setHotelname(String hotelname) {
		this.hotelname = hotelname;
	}
	public String getHoteladdress() {
		return hoteladdress;
	}
	public void setHoteladdress(String hoteladdress) {
		this.hoteladdress = hoteladdress;
	}
	public String getHotelownerinfo() {
		return hotelownerinfo;
	}
	public void setHotelownerinfo(String hotelownerinfo) {
		this.hotelownerinfo = hotelownerinfo;
	}


}
