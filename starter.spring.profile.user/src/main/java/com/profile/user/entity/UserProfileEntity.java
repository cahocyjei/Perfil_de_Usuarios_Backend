package com.profile.user.entity;

import javax.persistence.*;


@Entity
@Table(name="user_profile")
public class UserProfileEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name= "id")
	private int id;
	@Column(name="first_name")
	private String firstName;
	@Column(name="middle_name")
	private String middleName;
	@Column(name="last_name")
	private String lastName;
	
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="id_address")
	private UserAddressEntity userAddress;
	
	
	
	public UserProfileEntity(String firstName, String middleName, String lastName) {

		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
	}

	public UserProfileEntity() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public UserAddressEntity getUserAddress() {
		return userAddress;
	}


	public void setUserAddress(UserAddressEntity userAddress) {
		this.userAddress = userAddress;
	}


}
