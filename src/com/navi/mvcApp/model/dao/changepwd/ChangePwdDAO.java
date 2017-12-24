package com.navi.mvcApp.model.dao.changepwd;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.navi.mvcApp.dto.changepwd.ChangePwdDTO;

@Repository
public class ChangePwdDAO {
	
	public ChangePwdDAO() {
		System.out.println(this.getClass().getSimpleName()+" created...");
	}

	@Autowired
	private SessionFactory factory;
	
	public int changePwdByUserId(ChangePwdDTO dto) {
		
		System.out.println("calling changepwd By UserId...");
		String hql="update RegisterDTO R set R.password=:pwd, R.confirmpassword=:cpwd where R.userid=:uid";
		
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		Query query=session.createQuery(hql);//component used to execute hibernate or native query
		query.setParameter("pwd", dto.getNpwd());
		query.setParameter("cpwd", dto.getCpwd());
		query.setParameter("uid", dto.getUserid());
		int res =query.executeUpdate();
		transaction.commit();
		System.out.println("Rows affected="+res);
		return res;
	}
}
