package com.jsp.spring.backbencher.ems.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuthResponse {
    private String token;
    private String message;
	public AuthResponse(String token, String message) {
		super();
		this.token = token;
		this.message = message;
	}
}