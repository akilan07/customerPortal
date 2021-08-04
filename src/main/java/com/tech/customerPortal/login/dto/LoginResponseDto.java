package com.tech.customerPortal.login.dto;

import lombok.Data;

@Data
public class LoginResponseDto {

	private String userName;
	private String name;
	private Boolean loginFlag;
	private String errorMsg;
	
}
