package br.com.hospital.ticketnumber.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;

import br.com.hospital.ticketnumber.model.TicketNumber;

public class TicketNumberController {
	

	public ResponseEntity<List<TicketNumber>> findAll(){
		return null;
	}
	
	public ResponseEntity<TicketNumber> findById(Long id){
		return null;
	}
	
	public ResponseEntity<TicketNumber> insertTicketNumber(){ 
		return null;
	}
	
	public ResponseEntity<Void> deleteTicketNumber(Long id){
		return null;
	}
	
	public ResponseEntity<TicketNumber> updateTicketNumber(){
		return null;
	}
	
	public ResponseEntity<TicketNumber> findByCodeTicketNumber(String code){
		return null;
	}

}
