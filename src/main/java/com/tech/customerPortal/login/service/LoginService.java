package com.tech.customerPortal.login.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tech.customerPortal.login.dto.LoginResponseDto;
import com.tech.customerPortal.login.entity.Customer;
import com.tech.customerPortal.service.CustomerRepository;

@Service
public class LoginService {

	@Autowired
	CustomerRepository customerRepository;

	LoginResponseDto loginResponseDto;

	Customer cust;

	public LoginResponseDto loginUser(Customer customer) {
		
		System.out.println(" Input Customer data :: " + customer);
		cust = customerRepository.findByUserName(customer.getUserName());

		System.out.println("Customer data :: " + cust);
		loginResponseDto = new LoginResponseDto();
		if (customer.getCustomerPassword().getPassword().equals(cust.getCustomerPassword().getPassword())) {
			loginResponseDto.setLoginFlag(true);
			loginResponseDto.setUserName(cust.getUserName());
			loginResponseDto.setName(cust.getName());
		} else {
			loginResponseDto.setLoginFlag(false);
			loginResponseDto.setErrorMsg("Password Validation failed");
		}
		return loginResponseDto;
	}
}
