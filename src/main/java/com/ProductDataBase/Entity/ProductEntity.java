package com.ProductDataBase.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ProductEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int No;
	private long Prices;
	private String ProductName;
	private String Detail;
	
	public ProductEntity(int no, long prices, String productName, String detail) {
		super();
		No = no;
		Prices = prices;
		ProductName = productName;
		Detail = detail;
	}
	public ProductEntity() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "ProductEntity [No=" + No + ", Prices=" + Prices + ", ProductName=" + ProductName + ", Detail=" + Detail
				+ "]";
	}
	public int getNo() {
		return No;
	}
	public void setNo(int no) {
		No = no;
	}
	public long getPrices() {
		return Prices;
	}
	public void setPrices(long prices) {
		Prices = prices;
	}
	public String getProductName() {
		return ProductName;
	}
	public void setProductName(String productName) {
		ProductName = productName;
	}
	public String getDetail() {
		return Detail;
	}
	public void setDetail(String detail) {
		Detail = detail;
	}
	
	

}
