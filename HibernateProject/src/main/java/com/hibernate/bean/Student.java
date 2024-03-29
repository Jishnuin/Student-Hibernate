package com.hibernate.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Student implements Serializable {
	@Id	
	private int rollno;
	private String name;
	private long phno;
	private int standard;
}
