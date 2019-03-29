package com.cognizant.pts.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cognizant.pts.entity.Medicine;

@Repository
public class MedicineDAOImpl implements MedicineDAO {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public boolean addMedicine(Medicine medicine) {
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		session.persist(medicine);
		tx.commit();
		session.close();
		return true;
	}
	
	@Override
	public List<Medicine> viewAllMedicines() {
		
		Session session = sessionFactory.openSession();
		Query query = session.createQuery("from Medicine");
		List<Medicine> medicineList = query.list();
		session.close();
		return medicineList;
	}

}
