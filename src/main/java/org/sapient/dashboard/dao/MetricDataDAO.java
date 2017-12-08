package main.java.org.sapient.dashboard.dao;

import java.util.Date;

import main.java.org.sapient.dashboard.model.MetricData;

public interface MetricDataDAO extends GenericDAO<MetricData, Long> {

	void MetricDatainsert(String application,String metricCategory,String metricType,double iteration,double release,Date start_date, Date end_date);

}
