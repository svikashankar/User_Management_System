package com.navi.mvcApp.model.dao.forgotpassword;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ForgotDAO {

	public ForgotDAO() {
		System.out.println(this.getClass().getSimpleName() + " created..");
	}

	@Autowired
	private SessionFactory factory;

	public String checkUserByUserid(String userid) {
		System.out.println("Check UserByUsername started");
		String hql = "select R.email from RegisterDTO R where R.userid=:uid";
		Session session = factory.openSession();
		Query query = session.createQuery(hql);
		query.setParameter("uid", userid);
		String email = (String) query.uniqueResult();
		System.out.println("Check UserByUsername ended");
		return email;
	}

	public int resetPwdByEmailId(String email, String password) {
		System.out.println("Reset Pwd By EmailId started");
		String hql = "update RegisterDTO R set R.password=:pwd where R.email=:em";
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		Query query = session.createQuery(hql);
		query.setParameter("pwd", password);
		query.setParameter("em", email);
		int res = query.executeUpdate();
		transaction.commit();
		System.out.println("Reset Pwd By EmailId ended");
		return res;
	}
}
