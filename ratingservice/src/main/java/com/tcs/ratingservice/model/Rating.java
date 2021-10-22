package com.tcs.ratingservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//Entity Bean Class - A Bean Class representing Database Table
//Bean Class

@Entity
@Table(name = "rating")

public class Rating {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "rating_id")
	private int id;
	
	@Column(name = "user_id")
	private int userid;
	
	@Column(name = "item_id")
	private int itemid;
	
	private float rating;
	
	@Column(name = "last_updated_date")
	private String lastupdateddate;

	public Rating() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Rating(int id, int userid, int itemid, float rating, String lastupdateddate) {
		super();
		this.id = id;
		this.userid = userid;
		this.itemid = itemid;
		this.rating = rating;
		this.lastupdateddate = lastupdateddate;
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

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}

	public String getLastupdateddate() {
		return lastupdateddate;
	}

	public void setLastupdateddate(String lastupdateddate) {
		this.lastupdateddate = lastupdateddate;
	}

	@Override
	public String toString() {
		return "Rating [id=" + id + ", userid=" + userid + ", itemid=" + itemid + ", rating=" + rating
				+ ", lastupdateddate=" + lastupdateddate + "]";
	}
	
}
