package com.tnsif.customerservice;

import java.time.LocalDate;

import jakarta.persistence.Column;	
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Customer {
	@Id
	@Column(name="cid")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cid;
	@Column(name="cname")
    private String cname;
	@Column(name="address")
    private String address;
	@Column(name="mobileno")
    private String mobileno;
	@Column(name="cuscoupons")
    private String cuscoupons;
	@Column(name="email")
	private String email;
	@Column(name="loyaltypoints")
	private int loyaltypoints;
	@Column(name="birthdate")
	private LocalDate birthdate;
	
	
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMobileno() {
		return mobileno;
	}
	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}
	public String getCuscoupons() {
		return cuscoupons;
	}
	public void setCuscoupons(String cuscoupons) {
		this.cuscoupons = cuscoupons;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getLoyaltypoints() {
		return loyaltypoints;
	}
	public void setLoyaltypoints(int loyaltypoints) {
		this.loyaltypoints = loyaltypoints;
	}
	public LocalDate getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(LocalDate birthdate) {
		this.birthdate = birthdate;
	}
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(int cid, String cname, String address, String mobileno, String cuscoupons, String email,
			int loyaltypoints, LocalDate birthdate) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.address = address;
		this.mobileno = mobileno;
		this.cuscoupons = cuscoupons;
		this.email = email;
		this.loyaltypoints = loyaltypoints;
		this.birthdate = birthdate;
	}
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", address=" + address + ", mobileno=" + mobileno
				+ ", cuscoupons=" + cuscoupons + ", email=" + email + ", loyaltypoints=" + loyaltypoints
				+ ", birthdate=" + birthdate + "]";
	}
	
	
}
