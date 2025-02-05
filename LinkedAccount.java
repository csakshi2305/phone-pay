package com.example.demo.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity@Getter@Setter@AllArgsConstructor@NoArgsConstructor@ToString
public class LinkedAccount {

	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private Long id;
	    
	    @ManyToOne
	    private PhonePayUser phonePayUser;
	    
	    @ManyToOne
	    private BankUser bankUser;
}
