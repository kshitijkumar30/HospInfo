package com.cognizant.pts.service;

import java.util.List;

import com.cognizant.pts.entity.Medicine;

public interface MedicineService {
	boolean addMedicine(Medicine medicine);
	List<Medicine> viewAllMedicines();
	boolean persistMedicine(Medicine medicine);

}
