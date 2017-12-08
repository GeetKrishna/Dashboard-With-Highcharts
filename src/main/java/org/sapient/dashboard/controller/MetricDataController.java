package main.java.org.sapient.dashboard.controller;

import java.util.Date;

import main.java.org.sapient.dashboard.model.MetricData;
import main.java.org.sapient.dashboard.service.MetricDataService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MetricDataController {

	MetricDataService formSubmissionService=new MetricDataService();
	
	@RequestMapping(value="/submit",method=RequestMethod.POST)
	public void loadInitialData(@RequestBody MetricData metricData) {

		String application=metricData.getApplication();
		String metricCategory=metricData.getMetricCategory();
		String metricType=metricData.getMetricType();
		Double iteration=metricData.getIteration();
		Double release=metricData.getReleaseNo();
		Date startDate=metricData.getStartDate();
		Date endDate=metricData.getEndDate();
		System.out.println(application);
		System.out.println(metricType);
		System.out.println(metricCategory);
		System.out.println(iteration);
		System.out.println(release);
		System.out.println(startDate);
		System.out.println(endDate);
		formSubmissionService.doFormSubmission(metricData);

	}
	@RequestMapping(value="/s1")
	public String entry() {
		return "Hello";
}
	}
