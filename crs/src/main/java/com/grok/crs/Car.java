package com.grok.crs;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Car {

	@Column
	@Id
	@GeneratedValue
	private Long id;
	
	@Column
	private String name;
	
	@Column
	private int payGrade;
	
	public Car(){	
	}
	
	public Car(String name, int payGrade){
		this.name = name;
		this.payGrade = payGrade;
	}
	
}
