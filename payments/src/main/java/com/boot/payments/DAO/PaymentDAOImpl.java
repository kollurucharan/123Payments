package com.boot.payments.DAO;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.boot.payments.model.PaymentModel;
import com.boot.payments.rowmapper.PaymentRowMapper;
@Component
public class PaymentDAOImpl implements PaymentDAOInterface{
	
	@Autowired
	JdbcTemplate jd;
	
	@Override
	public ArrayList<PaymentModel> getAllTransaction() {
		String Sql="select * from InsurancePolicyPayments";
		return (ArrayList<PaymentModel>) jd.query(Sql, new PaymentRowMapper());
	}
}
