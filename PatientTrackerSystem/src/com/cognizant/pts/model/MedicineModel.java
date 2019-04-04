package com.cognizant.pts.model;

public class MedicineModel {
	
	private int medicineId;
	
	@Override
	public String toString() {
		return "MedicineModel [medicineId=" + medicineId + ", medicineDescription=" + medicineDescription + ", cureFor="
				+ cureFor + ", manufacturingCompany=" + manufacturingCompany + ", dosage=" + dosage + ", prescribedFor="
				+ prescribedFor + ", amount=" + amount + "]";
	}

	private String medicineDescription;
	
	private String cureFor;
	
	private String manufacturingCompany;
	
	private int dosage;
	
	public int getMedicineId() {
		return medicineId;
	}

	public void setMedicineId(int medicineId) {
		this.medicineId = medicineId;
	}

	public String getMedicineDescription() {
		return medicineDescription;
	}

	public void setMedicineDescription(String medicineDescription) {
		this.medicineDescription = medicineDescription;
	}

	public String getCureFor() {
		return cureFor;
	}

	public void setCureFor(String cureFor) {
		this.cureFor = cureFor;
	}

	public String getManufacturingCompany() {
		return manufacturingCompany;
	}

	public void setManufacturingCompany(String manufacturingCompany) {
		this.manufacturingCompany = manufacturingCompany;
	}

	public int getDosage() {
		return dosage;
	}

	public void setDosage(int dosage) {
		this.dosage = dosage;
	}

	public String getPrescribedFor() {
		return prescribedFor;
	}

	public void setPrescribedFor(String prescribedFor) {
		this.prescribedFor = prescribedFor;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	private String prescribedFor;
	
	private double amount;

}
