package com.boot.payments.repository;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.boot.payments.DAO.PaymentDAOInterface;
import com.boot.payments.model.PaymentModel;
@Repository
public class PaymentRepositoryImpl implements PaymentRepositoryInterface {

	@Autowired
	PaymentDAOInterface pdaoi;

	@Override
	public ArrayList<PaymentModel> getAllTransaction() {
		// TODO Auto-generated method stub
		return pdaoi.getAllTransaction();
	}
}
