package com.webapp.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webapp.springboot.model.Vendor;

public interface VendorRepository extends JpaRepository<Vendor, Long> {

}
