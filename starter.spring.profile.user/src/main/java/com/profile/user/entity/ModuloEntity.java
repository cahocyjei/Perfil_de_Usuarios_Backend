package com.profile.user.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="modulos")
public class ModuloEntity {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	@Column(name="modulo_name")
	private String moduloName;
	
	/*@OneToMany(mappedBy="moduloEntity",cascade= CascadeType.ALL)
	private List<OperationEntity> operacionEntity;*/
	
	public ModuloEntity() {
		
	}


	public ModuloEntity(String moduloName) {
		super();
		this.moduloName = moduloName;
	}



	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getModuloName() {
		return moduloName;
	}


	public void setModuloName(String moduloName) {
		this.moduloName = moduloName;
	}

	
}
