package main.java.org.sapient.dashboard.dao;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import main.java.org.sapient.dashboard.model.MetricData;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class GenericDAOImpl<T, ID extends java.io.Serializable> implements
		GenericDAO<T, ID> {

	 private JdbcTemplate jdbcTemplate;
	 private DriverManagerDataSource dataSource;

/*	public void insert(String application, String metricCategory,
			String metricType, double iteration, double release,
			Date start_date, Date end_date) {
		 String sql = "INSERT INTO METRICDATA " +
	                "(application,metricCategory,metricType,releaseNo,Iteration,startDate,endDate) VALUES (?, ?, ?, ?, ?, ?)";

	        this.jdbcTemplate = new JdbcTemplate(dataSource);
	        jdbcTemplate.execute(sql);
	    }*/

	public void insert(MetricData metricData) {
		 String sql = "INSERT INTO METRICDATA " +
	                "(application,metricCategory,metricType,releaseNo,Iteration,startDate,endDate) VALUES (?, ?, ?, ?, ?, ?)";

	        this.jdbcTemplate = new JdbcTemplate(dataSource);
	        jdbcTemplate.execute(sql);
		
	}
		
	}

