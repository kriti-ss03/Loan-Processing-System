package com.springboot_rest.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.AotInitializerNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot_rest.backend.model.LoanApp;
import com.springboot_rest.backend.repository.LoanRepo;

@RestController
@RequestMapping("/phansbank/v1/")
public class LoanController {

	@Autowired
	private LoanRepo loanRepo;
	
//	get all applcn
	@GetMapping("/view")
	public List<LoanApp> getAllIDs(){
		return loanRepo.findAll();
	}
	
//POST
	@PostMapping("/submit")
		public LoanApp createApplcn(@RequestBody LoanApp data) {
			return loanRepo.save(data);
		}
	
//GET APPCN BY ID-path variable : to view applcn by id
	@GetMapping("/view/{id}")
	public ResponseEntity<LoanApp> getAppcnById(@PathVariable Long id) {
		LoanApp data= loanRepo.findById(id)
				.orElseThrow(() -> new AotInitializerNotFoundException(null, 
				"Application doesn't exist for id"));
			return ResponseEntity.ok(data);
	}
	
	//update
	//delete
}

