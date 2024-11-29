package com.example.demo.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.BankUser;
import com.example.demo.entity.PhonePayUser;



@Repository
public interface BankUserRepository  extends JpaRepository<BankUser, Long> {
	  List<BankUser> findByPhonePayUserAndLinked(PhonePayUser phonePayUser, boolean linked);
}