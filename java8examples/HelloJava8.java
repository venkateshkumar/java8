package com.java8examples;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 
 * @author Venkateshkumar.S
 * 
 * Demonstrates sample functions in java 8 
 * Distinct function applied in Strings
 *
 */
public class HelloJava8 {
	public static void main(String[] args) {
		List<String> lstNames =new ArrayList<>();
		lstNames.add("Sai");
		lstNames.add("Ram");
		lstNames.add("Sai");
		System.out.println(lstNames.parallelStream().count());	
		List<String> distinctNames =lstNames.stream().distinct().collect(Collectors.toList());
		System.out.println(distinctNames.size());
	}
}
