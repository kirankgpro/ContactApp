package com.kiran.contactapp.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Contact {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer contactId;
	
	@Column
	private String name;
	@Column
	private String phone;
	@Column
	private String email;
	@Column
	private String address;
	@Column
	private String remark;
	
/* 
	@DateTimeFormat(pattern = "dd/MM/yyyy") //in this pattern the date is coming from client so it will be converted into date object
	@Column(name = "startTime", columnDefinition="DATETIME")
	@Temporal(TemporalType.TIMESTAMP)
	private java.util.Date dateAndTime;
	
	@Lob
 	@Column(name="BOOK_IMAGE", nullable=false, columnDefinition="blob")
	private byte[] image; 
	
	//in java 8 java.time.LocalDateTime introduced can be used without timezone its easy to map date and time
	@Column(columnDefinition="DATETIME")
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private LocalDateTime createdDate;
*/
	
	@ManyToOne
	@JoinColumn(name="userId")
	private User user;
	
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Integer getContactId() {
		return contactId;
	}
	public void setContactId(Integer contactId) {
		this.contactId = contactId;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	
}
