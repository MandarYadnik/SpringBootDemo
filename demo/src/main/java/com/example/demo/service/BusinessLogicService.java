package com.example.demo.service;


import org.springframework.stereotype.Component;

@Component
public class BusinessLogicService {
	
	public String getReverse(String text) {
		try {
		byte[] original_txt=text.getBytes();
		byte[] reverse_txt=text.getBytes();
		int length_of_array=text.length();
		for(int j=0;j<length_of_array;j++) {
			reverse_txt[j]=original_txt[length_of_array-j-1];
		}
		return new String(reverse_txt);
		}
		catch (Exception e) {
			return e.getMessage();
		}
	}
	
	
}
