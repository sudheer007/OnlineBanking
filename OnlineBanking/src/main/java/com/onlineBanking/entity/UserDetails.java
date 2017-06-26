package com.onlineBanking.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_details")
public class UserDetails implements  Serializable,Cloneable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name ="user_id")
	@Basic(optional=false)
	private Integer userid;
	
	@Column(name ="username")
	@Basic(optional=false)
	private String username;
	
	@Column(name ="email_id")
	@Basic(optional=false)
	private String emailId;
	
	@Column(name ="password")
	@Basic(optional=false)
	private String password;
	
	@Column(name ="createdBy")
	@Basic(optional=false)
	private Integer createdBy;
	
	@Column(name ="createdDate")
	@Basic(optional=false)
	private Date createdDate;
	
	@Column(name ="LastModifiedBy")
	@Basic(optional=false)
	private Integer lastModifiedBy;
	
	@Column(name ="LastModifiedDate")
	@Basic(optional=false)
	private Date lastModifiedDate;

	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Integer createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Integer getLastModifiedBy() {
		return lastModifiedBy;
	}

	public void setLastModifiedBy(Integer lastModifiedBy) {
		this.lastModifiedBy = lastModifiedBy;
	}

	public Date getLastModifiedDate() {
		return lastModifiedDate;
	}

	public void setLastModifiedDate(Date lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}

}
