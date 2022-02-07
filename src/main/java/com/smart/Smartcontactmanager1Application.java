package com.smart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class Smartcontactmanager1Application implements CommandLineRunner
{
	
  //---------------------------------------------------------------------------------------------
	
	@Autowired
	private BCryptPasswordEncoder bryBCryptPasswordEncoder;
	
	public static void main(String[] args) 
	{
		SpringApplication.run(Smartcontactmanager1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception
	{
		// TODO Auto-generated method stub

		
	}

}
