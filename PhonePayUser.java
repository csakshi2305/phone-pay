package com.example.demo.entity;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity@Getter@Setter@AllArgsConstructor@NoArgsConstructor@ToString
public class PhonePayUser{

	
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private Long id;
	    
	    @Column(unique = true, nullable = false)
	    private String mobileNumber;

	    @Column(nullable = false)
	    private String pin;
	    
	    @OneToMany(mappedBy = "phonePayUser")
	    private List<BankUser> bankUsers;
}
