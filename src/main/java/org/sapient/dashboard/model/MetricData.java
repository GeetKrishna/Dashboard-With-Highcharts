package main.java.org.sapient.dashboard.model;

import java.util.Date;


/**
 * The persistent class for the metricdata database table.
 * 
 */
/*@Entity
@NamedQuery(name="MetricData.findAll", query="SELECT m FROM MetricData m")*/
public class MetricData {

/*	@Id
	@SequenceGenerator(name="METRICDATA_METRICDATAID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="METRICDATA_METRICDATAID_GENERATOR")
	@Column(name="METRICDATA_ID")*/
	private int metricdataId;

	private String application;
/*
	@Temporal(TemporalType.DATE)
	@Column(name="END_DATE")*/
	private Date endDate;

	private double iteration;

/*	@Column(name="METRIC_CATEGORY")*/
	private String metricCategory;

/*	@Column(name="METRIC_TYPE")*/
	private String metricType;

/*	@Column(name="RELEASE_NO")*/
	private double releaseNo;

/*	@Temporal(TemporalType.DATE)
	@Column(name="START_DATE")*/
	private Date startDate;

	public MetricData() {
	}

	public int getMetricdataId() {
		return this.metricdataId;
	}

	public void setMetricdataId(int metricdataId) {
		this.metricdataId = metricdataId;
	}

	public String getApplication() {
		return this.application;
	}

	public void setApplication(String application) {
		this.application = application;
	}

	public Date getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public double getIteration() {
		return this.iteration;
	}

	public void setIteration(double iteration) {
		this.iteration = iteration;
	}

	public String getMetricCategory() {
		return this.metricCategory;
	}

	public void setMetricCategory(String metricCategory) {
		this.metricCategory = metricCategory;
	}

	public String getMetricType() {
		return this.metricType;
	}

	public void setMetricType(String metricType) {
		this.metricType = metricType;
	}

	public double getReleaseNo() {
		return this.releaseNo;
	}

	public void setReleaseNo(double releaseNo) {
		this.releaseNo = releaseNo;
	}

	public Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

}