package main.java.org.sapient.dashboard.dao;

import java.util.Date;
import java.util.List;

import main.java.org.sapient.dashboard.model.MetricData;


public interface GenericDAO<T, ID extends java.io.Serializable> {

	void insert(MetricData metricData);
}