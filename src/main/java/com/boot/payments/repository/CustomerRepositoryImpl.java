package com.boot.payments.repository;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.boot.payments.DAO.CustomerDAOInterface;
import com.boot.payments.model.CustomerModel;

@Repository
public class CustomerRepositoryImpl implements CustomerRepositoryInterface{
	
	@Autowired
	CustomerDAOInterface cdao;
	
	@Override
	public ArrayList<CustomerModel> getAllCustomers() {
		return cdao.getAllCustomers();
	}

	@Override
	public CustomerModel getCustomerId(int Id) {
		return cdao.getCustomerById(Id);
	}

	@Override
	public String updateStatus(int Id, String status) {
		return cdao.updateStatus(Id, status);
	}
	
}
