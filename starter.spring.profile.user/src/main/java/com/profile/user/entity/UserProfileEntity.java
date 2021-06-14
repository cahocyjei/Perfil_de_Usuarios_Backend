package com.profile.user.entity;

import java.util.Date;

import javax.persistence.*;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;


@Entity
@Table(name="user_profile")
@Inheritance(strategy  = InheritanceType.JOINED)
public class UserProfileEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name= "id_user")
	private int idUserProfile;
	@Column(name="first_name")
	private String firstName;
	@Column(name="middle_name")
	private String middleName;
	@Column(name="last_name")
	private String lastName;
	@Column(name="user_addres")
	private String address;
	
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(iso = ISO.DATE)
	@Column(name = "create_date")
	private Date createDate;
	
	public UserProfileEntity(String firstName, String middleName, String lastName) {

		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
	}

	public UserProfileEntity() {
		
	}
	
	public UserProfileEntity(Date createDate) {
	
		this.createDate = createDate;
	}

	public int getIdUserProfile() {
		return idUserProfile;
	}

	public void setIdUserProfile(int idUserProfile) {
		this.idUserProfile = idUserProfile;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		
		this.createDate = createDate;
	}
}
