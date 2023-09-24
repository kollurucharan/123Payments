package com.boot.payments.DAO;

import java.util.ArrayList;

import com.boot.payments.model.PaymentModel;

public interface PaymentDAOInterface {
	public ArrayList<PaymentModel> getAllTransaction();
}
