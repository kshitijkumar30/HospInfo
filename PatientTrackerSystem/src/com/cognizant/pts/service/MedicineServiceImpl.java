package com.cognizant.pts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cognizant.pts.dao.MedicineDAO;
import com.cognizant.pts.entity.Medicine;
import com.cognizant.pts.model.MedicineModel;

@Service
public class MedicineServiceImpl implements MedicineService{

	@Autowired
	private MedicineDAO medicineDAO;

	@Override
	public List<Medicine> viewAllMedicines() {
		// TODO Auto-generated method stub
		return medicineDAO.viewAllMedicines();
	}


	public boolean persistMedicine(MedicineModel medicineModel) {
		// TODO Auto-generated method stub
		Medicine medicine = new Medicine();
		medicine.setAmount(medicineModel.getAmount());
		medicine.setDosage(medicineModel.getDosage());
		medicine.setMedicineId(medicineModel.getMedicineId());
		medicine.setCureFor(medicineModel.getCureFor());
		medicine.setManufacturingCompany(medicineModel.getManufacturingCompany());
		medicine.setMedicineDescription(medicineModel.getMedicineDescription());
		medicine.setPrescribedFor(medicineModel.getPrescribedFor());
		return medicineDAO.addMedicine(medicine);
	}

	@Override
	public boolean updateMedicine(MedicineModel medicineModel) {
		// TODO Auto-generated method stub
		Medicine medicine = new Medicine();
		medicine.setAmount(medicineModel.getAmount());
		medicine.setDosage(medicineModel.getDosage());
		medicine.setMedicineId(medicineModel.getMedicineId());
		medicine.setCureFor(medicineModel.getCureFor());
		medicine.setManufacturingCompany(medicineModel.getManufacturingCompany());
		medicine.setMedicineDescription(medicineModel.getMedicineDescription());
		medicine.setPrescribedFor(medicineModel.getPrescribedFor());
		return medicineDAO.updateMedicine(medicine);
		
	}

	@Override
	public MedicineModel viewOneMedicine(int medicineId) {
		// TODO Auto-generated method stub
		Medicine medicine = medicineDAO.viewOneMedicine(medicineId);
		MedicineModel medicineModel = new MedicineModel();
		medicineModel.setAmount(medicine.getAmount());
		medicineModel.setDosage(medicine.getDosage());
		medicineModel.setMedicineId(medicine.getMedicineId());
		medicineModel.setCureFor(medicine.getCureFor());
		medicineModel.setManufacturingCompany(medicine.getManufacturingCompany());
		medicineModel.setMedicineDescription(medicine.getMedicineDescription());
		medicineModel.setPrescribedFor(medicine.getPrescribedFor());
		return medicineModel;
	}


	
	
}
