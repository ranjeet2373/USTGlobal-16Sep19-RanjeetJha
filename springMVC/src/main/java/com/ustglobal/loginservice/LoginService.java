package com.ustglobal.loginservice;

import org.springframework.stereotype.Service;

@Service
public class LoginService {
	
	public boolean validateUser(String name,String password) {
		return name.equalsIgnoreCase("ranjeet")&&password.equals("savetree");
	}

}
