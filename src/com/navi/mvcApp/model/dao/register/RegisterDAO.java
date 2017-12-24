package com.navi.mvcApp.model.dao.register;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.navi.mvcApp.dto.register.RegisterDTO;

@Repository
public class RegisterDAO {

	public RegisterDAO() {
		System.out.println(this.getClass().getSimpleName() + " created..");
	}

	@Autowired
	private SessionFactory factory;

	public void save(RegisterDTO dto) {

		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		try {
			session.save(dto);
			transaction.commit();
		} catch (HibernateException he) {
			he.printStackTrace();
		} finally {
			session.close();
		}
	}

}
