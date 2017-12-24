package com.navi.mvcApp.model.dao.login;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.navi.mvcApp.dto.login.LoginDTO;
import com.navi.mvcApp.dto.register.RegisterDTO;

@Repository
public class LoginDAO {
	public LoginDAO() {
		System.out.println(this.getClass().getSimpleName() + " created");
	}
	
	@Autowired
	private SessionFactory factory;
	
	public RegisterDTO fetchUser(LoginDTO dto) {
		
		System.out.println("fetching user started...");
		
		String hql="select R from RegisterDTO R where R.userid=:uid and R.password=:pwd";
		Session session=factory.openSession();
		Query query= session.createQuery(hql); 
		query.setParameter("uid", dto.getUserid());
		query.setParameter("pwd", dto.getPassword());
		RegisterDTO dtoFromDB=(RegisterDTO) query.uniqueResult();
		
		
		System.out.println("fetching user ended...");
		
		return dtoFromDB;
	}
	
	public List<RegisterDTO> getAll() {

		System.out.println("fetching user started...");

		String hql = "select R from RegisterDTO R";
		Session session = factory.openSession();
		Query query = session.createQuery(hql);
		List<RegisterDTO> list = query.list();

		System.out.println("fetching user ended...");

		return list;
	}
	
	

}
