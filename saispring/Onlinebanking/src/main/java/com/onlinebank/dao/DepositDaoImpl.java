package com.onlinebank.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.onlinebank.model.Deposit;
@Repository
public class DepositDaoImpl implements DepositDao {
    @Autowired
	JdbcTemplate jdbcTemplate;
	@Override
	public int addamt(Deposit depo) {
		String sql="update bankclients set amount=amount+'"+(depo.getAmount())/2+"' where accountnumber="+depo.getAccountnumber()+"";
		jdbcTemplate.update(sql);
		return jdbcTemplate.update(sql);
	}

}
