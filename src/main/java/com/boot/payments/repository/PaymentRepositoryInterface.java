package com.boot.payments.repository;

import java.util.ArrayList;

import com.boot.payments.model.PaymentModel;

public interface PaymentRepositoryInterface {
	public ArrayList<PaymentModel> getAllTransaction();
}
