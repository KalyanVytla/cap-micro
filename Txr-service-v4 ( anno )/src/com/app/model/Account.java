package com.app.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ACCOUNTS", schema = "my_bank")
public class Account {

	@Id
	private String num;
	private double balance;

	public Account() {
	}

	public Account(String num, double balance) {
		super();
		this.num = num;
		this.balance = balance;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

}
