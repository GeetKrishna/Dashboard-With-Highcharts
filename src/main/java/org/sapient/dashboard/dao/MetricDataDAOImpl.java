package main.java.org.sapient.dashboard.dao;

import java.util.Date;

import javax.transaction.Transactional;

import main.java.org.sapient.dashboard.model.MetricData;

public class MetricDataDAOImpl extends GenericDAOImpl<MetricData, Long>
implements MetricDataDAO {

@Transactional
public void MetricDatainsert(String application, String metricCategory,
		String metricType, double iteration, double release, Date start_date,
		Date end_date) {
	super.insert(application, metricCategory, metricType, iteration, release, start_date, end_date);
	
}
}