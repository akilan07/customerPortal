package com.tech.customerPortal.login.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Embeddable
@Setter
@Getter
@ToString
public class CustomerPassword {
		
		@Column(name = "password", table = "customer_password")
		private String password;

}
