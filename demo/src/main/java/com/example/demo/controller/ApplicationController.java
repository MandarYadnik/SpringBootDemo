package com.example.demo.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.ResponseEx;
import com.example.demo.service.BusinessLogicService;

@RestController
@RequestMapping(path="/api")
public class ApplicationController {
	
	@Autowired
	private BusinessLogicService businessLogicService; 
	
	@GetMapping(path = "/{text}")
	public ResponseEx show(@PathVariable String text) {
			return new ResponseEx(businessLogicService.getReverse(text));
			
		}
}
