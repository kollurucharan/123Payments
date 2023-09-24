package com.boot.payments.DAO;

import java.util.ArrayList;

import com.boot.payments.model.DiseaseModel;

public interface DiseaseDAOInterface {

	public ArrayList<DiseaseModel> getAllDisease();

	public String addDisease(String name,String iscCode,String desc,String status);

	public String editDisease(String name, String ICDCode, String desc, String status);

	public String deleteDisease(String name);
}
