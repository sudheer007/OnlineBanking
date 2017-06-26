package com.onlineBanking.Dao.Impl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.onlineBanking.Dao.UserDao;

public class TestingFunctionality {

	public static void main(String[] args) {
		ApplicationContext context =
		    	   new ClassPathXmlApplicationContext(new String[] {"Bean.xml"});

		    	UserDao userdao = (UserDao)context.getBean("userDao");
		    	userdao.fetchuserDetails();
	}

}
