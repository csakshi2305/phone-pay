package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity@Getter@Setter@AllArgsConstructor@NoArgsConstructor@ToString
public class BankUser {
	
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private Long id;
	    
	    @Column(unique = true, nullable = false)
	    private String accountNumber;
	    
	    @ManyToOne
	    private PhonePayUser phonePayUser;
	    
	    private boolean linked;


}
