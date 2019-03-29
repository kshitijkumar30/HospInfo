package com.cognizant.pts.validation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.cognizant.pts.entity.Medicine;
import com.cognizant.pts.service.MedicineServiceImpl;

@Component("MedicineValidator")
public class MedicineValidator implements Validator {

	@Autowired
	private MedicineServiceImpl medicineService;
	
	@Override
	public boolean supports(Class<?> clazz) {
		return Medicine.class.isAssignableFrom(clazz);
		// TODO Auto-generated method stub
	}

	@Override
	public void validate(Object target, Errors errors)
	{
		Medicine medicine = (Medicine) target;
		ValidationUtils.rejectIfEmpty(errors, "medicineId", "medicineID.required");
		ValidationUtils.rejectIfEmpty(errors, "medicineDescription", "medicineDescription.required");
		ValidationUtils.rejectIfEmpty(errors, "cureFor", "medicineCure.required");
		ValidationUtils.rejectIfEmpty(errors, "manufacturingCompany", "medicineCompany.required");
		ValidationUtils.rejectIfEmpty(errors, "dosage", "medicineDosage.required");
		if(medicine.getDosage() < 1 || medicine.getDosage() > 999)
		{
			errors.rejectValue("dosage", "invalid.value");
		}
		ValidationUtils.rejectIfEmpty(errors, "prescribedFor", "medicinePrescribedFor.required");
		ValidationUtils.rejectIfEmpty(errors, "amount", "medicineAmount.required");
	}
}
