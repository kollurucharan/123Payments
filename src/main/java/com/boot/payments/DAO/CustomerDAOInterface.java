package com.boot.payments.DAO;

import java.util.ArrayList;

import com.boot.payments.model.CustomerModel;

public interface CustomerDAOInterface {

	ArrayList<CustomerModel> getAllCustomers();

	CustomerModel getCustomerById(int id);

	String updateStatus(int id, String status);
}
