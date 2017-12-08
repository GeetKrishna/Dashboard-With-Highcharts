package main.java.org.sapient.dashboard.service;

import java.util.Date;

import main.java.org.sapient.dashboard.dao.MetricDataDAO;
import main.java.org.sapient.dashboard.model.MetricData;

import org.springframework.beans.factory.annotation.Autowired;

public class MetricDataService {

	@Autowired
	MetricDataDAO metricDataDAO;

	public void doFormSubmission(MetricData metricData) {
		System.out.println("Hello");
		metricDataDAO.insert(metricData);
		
	}
}
