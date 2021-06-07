package com.profile.user.entity;

import javax.persistence.*;

@Entity
@Table(name = "user_address")
public class UserAddressEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	@Column(name = "address")
	private String address;

	@OneToOne(mappedBy="userAddress",cascade=CascadeType.ALL)
	private UserProfileEntity userProfile;
	
	public UserAddressEntity(int id, String address) {

		this.id = id;
		this.address = address;
	}
	

	public UserAddressEntity() {
		
	}


	public UserAddressEntity(String address) {
		
		this.address = address;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	
}
