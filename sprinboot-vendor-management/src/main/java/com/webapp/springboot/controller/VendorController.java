package com.webapp.springboot.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webapp.springboot.model.Vendor;
import com.webapp.springboot.service.VendorService;

@RestController
@RequestMapping("/vendor_api")
public class VendorController {

	private VendorService vendorService;

	public VendorController(VendorService vendorService) {
		super();
		this.vendorService = vendorService;
	}

	@PostMapping("/save_vendor")
	public ResponseEntity<Vendor> saveVendor(@RequestBody Vendor vendor) {
		return new ResponseEntity<Vendor>(vendorService.saveVendor(vendor), HttpStatus.OK);
	}

	@GetMapping("/get_vendors")
	public List<Vendor> allVendors() {
		return vendorService.allVendors();
	}

	@GetMapping("/get_vendor/{id}")
	public ResponseEntity<Vendor> getVendor(@PathVariable("id") long id) {
		return new ResponseEntity<Vendor>(vendorService.getVendor(id), HttpStatus.OK);

	}

	@PutMapping("/update_vendor/{id}")
	public ResponseEntity<Vendor> updateVendor(@PathVariable("id") long id, @RequestBody Vendor vendor) {
		return new ResponseEntity<Vendor>(vendorService.updateVendor(id, vendor), HttpStatus.OK);
	}

}
