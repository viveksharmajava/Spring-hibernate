package com.in28minutes;

import org.springframework.stereotype.Service;

@Service
public class LoginService {
	public boolean validateUser(String user, String password) {
		return user.equalsIgnoreCase("vivek") && password.equals("vivek");
	}

}