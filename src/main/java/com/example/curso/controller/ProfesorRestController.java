package com.example.curso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.curso.entity.Profesor;
import com.example.curso.service.ProfesorServiceImpl;

@RestController
public class ProfesorRestController {

	@Autowired
	ProfesorServiceImpl profesorService;
	
	@RequestMapping(value= "/all_professors_public", method = RequestMethod.GET)
	public ResponseEntity <List<Profesor>> listAllProfessor(){
		List<Profesor> profesores = profesorService.findAllProfessors();
		if(profesores.isEmpty()) {
			return new ResponseEntity<List<Profesor>> (HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<Profesor>> (profesores,HttpStatus.OK);
	}
	
	@RequestMapping(value= "/all_professors_admin", method = RequestMethod.GET)
	public ResponseEntity <List<Profesor>> listAllProfessorAdmin(){
		List<Profesor> profesores = profesorService.findAllProfessors();
		if(profesores.isEmpty()) {
			return new ResponseEntity<List<Profesor>> (HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<Profesor>> (profesores,HttpStatus.OK);
	}
	
	@RequestMapping(value= "/all_professors_user", method = RequestMethod.GET)
	public ResponseEntity <List<Profesor>> listAllProfessorUser(){
		List<Profesor> profesores = profesorService.findAllProfessors();
		if(profesores.isEmpty()) {
			return new ResponseEntity<List<Profesor>> (HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<Profesor>> (profesores,HttpStatus.OK);
	}

	
	
}
