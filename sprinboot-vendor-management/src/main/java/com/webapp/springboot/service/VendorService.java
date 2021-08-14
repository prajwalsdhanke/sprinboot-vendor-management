package com.webapp.springboot.service;

import java.util.List;

import com.webapp.springboot.model.Vendor;

public interface VendorService {
	public Vendor saveVendor(Vendor vendor);

	public List<Vendor> allVendors();

	public Vendor getVendor(long id);

	public Vendor updateVendor(long id, Vendor vendor);
}
