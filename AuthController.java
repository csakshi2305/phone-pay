package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.BankUser;
import com.example.demo.entity.PhonePayUser;
import com.example.demo.repository.PhonePayUserRepository;


@RestController
@RequestMapping("/api/auth")
@CrossOrigin
public class AuthController {

	 @Autowired
	    private PhonePayUserRepository userRepository;
	    
	    @PostMapping("/login")
	    public boolean login(@RequestParam String mobileNumber, @RequestParam String pin) {
	        PhonePayUser user = userRepository.findByMobileNumber(mobileNumber);
	        return user != null && user.getPin().equals(pin);
	    }
	    
	    @PostMapping("/register")
	    public PhonePayUser register(@RequestParam String mobileNumber, @RequestParam String pin) {
	        PhonePayUser user = new PhonePayUser();
	        user.setMobileNumber(mobileNumber);
	        user.setPin(pin);
	        return userRepository.save(user);
	    }
	}