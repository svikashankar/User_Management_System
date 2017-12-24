package com.navi.mvcApp.model.dao.update;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.navi.mvcApp.dto.register.RegisterDTO;

@Repository
public class UpdateDAO {

	public UpdateDAO() {
		System.out.println(this.getClass().getSimpleName() + " created...");
	}

	@Autowired
	private SessionFactory factory;

	public RegisterDTO save(RegisterDTO dto) {

		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		

			RegisterDTO rdto=(RegisterDTO) session.merge(dto);
			transaction.commit();

			session.close();
		return rdto;
		
	}

}
