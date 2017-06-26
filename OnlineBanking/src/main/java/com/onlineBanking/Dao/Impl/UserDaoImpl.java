package com.onlineBanking.Dao.Impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.onlineBanking.Dao.UserDao;
import com.onlineBanking.entity.UserDetails;

@Component("userDao")
public class UserDaoImpl implements UserDao{
	
	@Autowired
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Transactional
	public void fetchuserDetails() {
		Session session =sessionFactory.openSession();
		UserDetails userdetails= (UserDetails) session.get(UserDetails.class, 1);
		System.out.println(userdetails.getEmailId());
	}
	
	@Transactional
	public void insertUserDetails(UserDetails userDetails) {
		Session session = sessionFactory.openSession();
		session.save(userDetails);
	}

	
}
