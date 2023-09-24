package com.boot.payments.repository;

import java.util.ArrayList;

import com.boot.payments.model.CustomerModel;

public interface CustomerRepositoryInterface {

	ArrayList<CustomerModel> getAllCustomers();

	CustomerModel getCustomerId(int Id);

	String updateStatus(int parseInt, String status);
}
