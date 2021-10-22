package com.tcs.cartservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//Entity Bean Class - A Bean Class representing Database Table
//Bean Class

@Entity
@Table(name = "cart")

public class Cart {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "order_id")
	private int id;
	
	@Column(name = "user_id")
	private int userid;
	
	@Column(name = "item_id")
	private int itemid;
	
	private int quantity;
	
	@Column(name = "total_price")
	private int totalprice;

	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cart(int id, int userid, int itemid, int quantity, int totalprice) {
		super();
		this.id = id;
		this.userid = userid;
		this.itemid = itemid;
		this.quantity = quantity;
		this.totalprice = totalprice;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public int getItemid() {
		return itemid;
	}

	public void setItemid(int itemid) {
		this.itemid = itemid;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getTotalprice() {
		return totalprice;
	}

	public void setTotalprice(int totalprice) {
		this.totalprice = totalprice;
	}

	@Override
	public String toString() {
		return "Cart [id=" + id + ", userid=" + userid + ", itemid=" + itemid + ", quantity=" + quantity
				+ ", totalprice=" + totalprice + "]";
	}
	
}
