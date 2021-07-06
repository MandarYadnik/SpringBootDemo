package com.example.demo.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BusinessLogicDuplicate {

	public static void main(String[] args) {
		//Integer input_arr[]= {1,1,2,2,2,3,4,5,6,6,6,6,6,7};
		Integer input_arr[]= {1,1,1,1,1,1,2,3};
		System.out.println(removeDuplicates(input_arr));
		removeDuplicatesFromArray(input_arr);
		
							
	}
	public static List<Integer> removeDuplicates(Integer[] input_arr){

		//java 8 solution input array

		ArrayList<Integer> list=new ArrayList<>(Arrays.asList(input_arr));
		
		List<Integer> list_without_dups=list.stream()
			.distinct()
			.collect(Collectors.toList());
		return list_without_dups;
		
	}
	
	public static void removeDuplicatesFromArray(Integer[] input_array) {
		//java solution
		//Integer input_array[]= {1,1,2,2,2,3,4,5,6,6,6,6,6,7};
				
		int length_of_input=input_array.length;
		int[] output_array= new int[length_of_input];
		int y=0;
		if(length_of_input==0|| length_of_input==1) {
			System.out.println("Array Length is "+ length_of_input);
		}
		else {
			System.out.println(length_of_input);
			
			for(int x=0;x<length_of_input-1;x++) {
				if(input_array[x]!= input_array[x+1]) {
					output_array[y]=input_array[x];
					y=y+1;
				}
			}
					output_array[y]=input_array[length_of_input-1];
					y=y+1;
				
			}
		
		for (int z=0 ;z< y;z++) {
			System.out.print(output_array[z]+" ");
		}
		
	}

}
