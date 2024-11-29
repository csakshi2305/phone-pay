package com.example.demo.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.LinkedAccount;
import com.example.demo.entity.PhonePayUser;


public interface LinkedAccountRepository extends JpaRepository<LinkedAccount, Long> {
	 List<LinkedAccount> findByPhonePayUser(PhonePayUser phonePayUser);
}