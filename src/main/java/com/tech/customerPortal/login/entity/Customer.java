package com.tech.customerPortal.login.entity;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
@Table(name = "customer")
@SecondaryTable(name = "customer_password", pkJoinColumns = @PrimaryKeyJoinColumn(name = "cust_id"))
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cust_id")
	private long id;
	
	@Column(name = "cust_username")
	private String userName;
	
	@Column(name = "cust_name")
	private String name;
	
	@Embedded
	private CustomerPassword customerPassword;

}