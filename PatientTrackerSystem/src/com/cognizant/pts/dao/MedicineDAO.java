package com.cognizant.pts.dao;

import java.util.List;

import com.cognizant.pts.entity.Medicine;

public interface MedicineDAO {
	boolean addMedicine(Medicine medicine);
	List<Medicine> viewAllMedicines();
	boolean updateMedicine(Medicine medicine);
	Medicine viewOneMedicine(int medicineId);
}
