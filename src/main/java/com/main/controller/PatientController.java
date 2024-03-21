package com.main.controller;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PatientController
{
	 @GetMapping("/getPatient")
     public ResponseEntity<String> displayPatient()
     {
    	  return new ResponseEntity<String>("Patient Details Fetched", HttpStatus.OK);
     }
	 @PostMapping("/registerPatient")
	 public ResponseEntity<String> registerPatient()
	 {
		 
		 return new ResponseEntity<String>("Patient is registerd",HttpStatus.CREATED);
	 }
	 @PutMapping("/updatePatient")
	 public ResponseEntity<String> updatePatient()
	 {
		 return new ResponseEntity<String>("Patient is updated",HttpStatus.OK);
	 }
	 @PatchMapping("/partialUpdate")
	 public ResponseEntity<String> partialUpdatePatient()
	 {
		 return new ResponseEntity<String>("Patient is updated partially",HttpStatus.OK);
	 }
	 @DeleteMapping("/deletePatient")
	 public ResponseEntity<String> deletePatient()
	 {
		 return new ResponseEntity<String>("Patient is deleted",HttpStatus.OK);
	 }
}
