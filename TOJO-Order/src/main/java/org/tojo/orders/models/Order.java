package org.tojo.orders.models;

import java.sql.Date;
import java.util.List;

public class Order {
	private int id;
	private String customerName;
	private String customerPhong;
	private String customerEmail;
	private Date createDate;
	private List<OrderDetail> orderDetails;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerPhong() {
		return customerPhong;
	}
	public void setCustomerPhong(String customerPhong) {
		this.customerPhong = customerPhong;
	}
	public String getCustomerEmail() {
		return customerEmail;
	}
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public List<OrderDetail> getOrderDetails() {
		return orderDetails;
	}
	public void setOrderDetails(List<OrderDetail> orderDetails) {
		this.orderDetails = orderDetails;
	}
	
	
}
