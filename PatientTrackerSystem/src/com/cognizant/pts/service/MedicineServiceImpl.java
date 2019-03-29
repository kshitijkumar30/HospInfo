package com.cognizant.pts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cognizant.pts.dao.MedicineDAO;
import com.cognizant.pts.entity.Medicine;

@Service
public class MedicineServiceImpl implements MedicineService{

	@Autowired
	private MedicineDAO medicineDAO;

	@Override
	public boolean addMedicine(Medicine medicine) {
		// TODO Auto-generated method stub
		return medicineDAO.addMedicine(medicine);
	}

	@Override
	public List<Medicine> viewAllMedicines() {
		// TODO Auto-generated method stub
		return medicineDAO.viewAllMedicines();
	}


	public boolean persistMedicine(Medicine medicine) {
		// TODO Auto-generated method stub
		return medicineDAO.addMedicine(medicine);
	}


	
	
}
