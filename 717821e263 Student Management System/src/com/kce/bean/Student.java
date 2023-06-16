package com.kce.bean;

public class Student {
	private int STUDENT_ID;
	   private String NAME;
	   private String EMAIL;
	   private int PHONE_NO;
	   private String DEPT;
	   private String ADRESS;
	public  Student(int sTUDENT_ID, String nAME, String eMAIL, int pHONE_NO, String dEPT, String aDRESS) {
		super();
		STUDENT_ID = sTUDENT_ID;
		NAME = nAME;
		EMAIL = eMAIL;
		PHONE_NO = pHONE_NO;
		DEPT = dEPT;
		ADRESS = aDRESS;
	}
	public int getSTUDENT_ID() {
		return STUDENT_ID;
	}
	public void setSTUDENT_ID(int sTUDENT_ID) {
		STUDENT_ID = sTUDENT_ID;
	}
	public String getNAME() {
		return NAME;
	}
	public void setNAME(String nAME) {
		NAME = nAME;
	}
	public String getEMAIL() {
		return EMAIL;
	}
	public void setEMAIL(String eMAIL) {
		EMAIL = eMAIL;
	}
	public int getPHONE_NO() {
		return PHONE_NO;
	}
	public void setPHONE_NO(int pHONE_NO) {
		PHONE_NO = pHONE_NO;
	}
	public String getDEPT() {
		return DEPT;
	}
	public void setDEPT(String dEPT) {
		DEPT = dEPT;
	}
	public String getADRESS() {
		return ADRESS;
	}
	public void setADRESS(String aDRESS) {
		ADRESS = aDRESS;
	}
	@Override
	public String toString() {
		return "student [STUDENT_ID=" + STUDENT_ID + ", NAME=" + NAME + ", EMAIL=" + EMAIL + ", PHONE_NO=" + PHONE_NO
				+ ", DEPT=" + DEPT + ", ADRESS=" + ADRESS + "]";
	}
	   
	}


