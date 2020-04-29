package com.service;

import com.entities.Login;

public class ValidateImpl implements IValidate
{
	Login log1= new Login("aditya","1234");
	Login log2= new Login("ramesh","ramesh");
	Login log3= new Login("suresh","suresh");
	
	Login[] logins= {log1,log2,log3};
	public String validateLogin(String username,String password) 
	{
		for(Login log:logins) 
		{
			if(log.getUserName().equals(username) && log.getPassword().equals(password)) {
				return "Successful";
			}
		}

		return "Failed";
	}
}
