package com.webapp.springboot.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.webapp.springboot.exception.ResourceNotFoundException;
import com.webapp.springboot.model.Vendor;
import com.webapp.springboot.repository.VendorRepository;

@Service
public class VendorServiceImpl implements VendorService {

	private VendorRepository vendorRepository;

	public VendorServiceImpl(VendorRepository vendorRepository) {
		super();
		this.vendorRepository = vendorRepository;
	}

	@Override
	public Vendor saveVendor(Vendor vendor) {
		return vendorRepository.save(vendor);
	}

	@Override
	public List<Vendor> allVendors() {
		return vendorRepository.findAll();
	}

	@Override
	public Vendor getVendor(long id) {

		return vendorRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Vendor", "id", id));

	}

	@Override
	public Vendor updateVendor(long id, Vendor vendor) {

		Vendor existedVendor = vendorRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Vendor", "Id", id));

		existedVendor.setVendorName(vendor.getVendorName());
		existedVendor.setVehicleType(vendor.getVehicleType());
		existedVendor.setVehicleNumber(vendor.getVehicleNumber());
		existedVendor.setVehicleMonthlyRent(vendor.getVehicleMonthlyRent());

		vendorRepository.save(existedVendor);
		return existedVendor;
	}

}
