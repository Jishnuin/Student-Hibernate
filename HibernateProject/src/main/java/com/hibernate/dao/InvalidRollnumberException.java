package com.hibernate.dao;

public class InvalidRollnumberException extends Throwable {
	String msg;


	public InvalidRollnumberException(String msg) {
	this.msg = msg;
	}

	public String setMessage() {

	return this.msg;
	}
}
