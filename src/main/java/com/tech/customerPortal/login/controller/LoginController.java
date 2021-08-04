package com.tech.customerPortal.login.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tech.customerPortal.login.dto.LoginDto;
import com.tech.customerPortal.login.dto.LoginResponseDto;
import com.tech.customerPortal.login.entity.Customer;
import com.tech.customerPortal.login.entity.CustomerPassword;
import com.tech.customerPortal.login.service.LoginService;

@RestController
public class LoginController {

	@Autowired
	LoginService loginService;
	

	ModelMapper modelMapper;
	
	public LoginController() {
		modelMapper = new ModelMapper();
	}

	@PostMapping(path = "/login")
	public LoginResponseDto loginUser(@RequestBody LoginDto loginDto) {
		return loginService.loginUser(modelMapper.map(loginDto, Customer.class));
	}

	private Customer convertDtoToEntity(LoginDto loginDto) {
		Customer customer = new Customer();
		customer.setUserName(loginDto.getUsername());
		CustomerPassword customerPassword = new CustomerPassword();
		customerPassword.setPassword(loginDto.getPassword());
		customer.setCustomerPassword(customerPassword);
		return customer;
	}

}
