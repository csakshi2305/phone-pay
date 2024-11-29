package com.example.demo.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.BankUser;
import com.example.demo.entity.PhonePayUser;
import com.example.demo.repository.BankUserRepository;
import com.example.demo.repository.PhonePayUserRepository;

@RestController
@RequestMapping("/api/bank-users")

public class BankUserController {

    @Autowired
    private BankUserRepository bankUserRepository;

    @Autowired
    private PhonePayUserRepository userRepository;

    @GetMapping("/non-linked/{mobileNumber}")
    public List<BankUser> getNonLinkedAccounts(@PathVariable String mobileNumber) {
        PhonePayUser user = userRepository.findByMobileNumber(mobileNumber);
        return bankUserRepository.findByPhonePayUserAndLinked(user, false);
    }
    
    @PostMapping("/link")
    public void linkAccount(@RequestParam Long accountId, @RequestParam String mobileNumber) {
        PhonePayUser user = userRepository.findByMobileNumber(mobileNumber);
        BankUser bankUser = bankUserRepository.findById(accountId).orElseThrow();
        bankUser.setLinked(true);
        bankUserRepository.save(bankUser);
    }
}