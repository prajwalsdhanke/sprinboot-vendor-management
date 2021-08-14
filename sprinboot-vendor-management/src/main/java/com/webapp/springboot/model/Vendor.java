package com.webapp.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Vendor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "vendor_id")
	private long id;
	@Column(name = "vendor_name")
	private String vendorName;
	@Column(name = "vehicle_number")
	private String vehicleNumber;
	@Column(name = "vehicle_type")
	private String vehicleType;
	@Column(name = "vehicle_monthly_rent")
	private double vehicleMonthlyRent;

	public Vendor() {
	}

	public Vendor(long id, String vendorName, String vehicleNumber, String vehicleType, double vehicleMonthlyRent) {
		super();
		this.id = id;
		this.vendorName = vendorName;
		this.vehicleNumber = vehicleNumber;
		this.vehicleType = vehicleType;
		this.vehicleMonthlyRent = vehicleMonthlyRent;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getVendorName() {
		return vendorName;
	}

	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}

	public String getVehicleNumber() {
		return vehicleNumber;
	}

	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public double getVehicleMonthlyRent() {
		return vehicleMonthlyRent;
	}

	public void setVehicleMonthlyRent(double vehicleMonthlyRent) {
		this.vehicleMonthlyRent = vehicleMonthlyRent;
	}

}
