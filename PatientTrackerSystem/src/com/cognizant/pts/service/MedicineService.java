package com.cognizant.pts.service;

import java.util.List;

import com.cognizant.pts.entity.Medicine;
import com.cognizant.pts.model.MedicineModel;

public interface MedicineService {
	List<Medicine> viewAllMedicines();
	boolean persistMedicine(MedicineModel medicineModel);
	boolean updateMedicine(MedicineModel medicineModel);
	MedicineModel viewOneMedicine(int medicineId);
}
