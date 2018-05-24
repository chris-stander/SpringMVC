package com.packt.webstore.domain.repository.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.packt.webstore.domain.CustomerHero;

import com.packt.webstore.domain.repository.CustomerRepository;

@Repository
public class InMemoryCustomerRepository implements CustomerRepository {

	@Autowired
	private NamedParameterJdbcTemplate jdbcTemplate;

	@Override
	public List<CustomerHero> getAllCustomers() {
		Map<String, Object> params = new HashMap<String, Object>();
		List<CustomerHero> result = jdbcTemplate.query("SELECT * FROM CUSTOMERS", params, new CustomerMapper());
		return result;

	}

	private static final class CustomerMapper implements RowMapper<CustomerHero> {
		public CustomerHero mapRow(ResultSet rs, int rowNum) throws SQLException {
			CustomerHero customer = new CustomerHero();
			customer.setCustomerId(rs.getString("ID"));
			customer.setName(rs.getString("NAME"));
			customer.setAddress(rs.getString("ADDRESS"));
			customer.setNoOfOrdersMade(rs.getLong("NO_OF_ORDERS_MADE"));

			return customer;

		}
	}

}