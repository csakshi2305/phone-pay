package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.PhonePayUser;

@Repository
public interface PhonePayUserRepository extends JpaRepository<PhonePayUser, Long> {
	 PhonePayUser findByMobileNumber(String mobileNumber);
}