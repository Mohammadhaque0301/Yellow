package com.uk.pagefactory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;



public class ArrayPractice {
public static void main(String[] args) {
	List <Integer> num = new ArrayList<>();
	num.add(10);
	num.add(20);
	num.add(40);
	num.add(90);
	num.add(30);
	num.add(50);
	num.add(60);
	num.add(80);
	num.add(40);
	System.out.println(" before remove duplicate: " +num);
	
	num = num.stream().distinct().collect(Collectors.toList());
	System.out.println(" after remove duplicate: " +num);
	
	Collections.sort(num);
	System.out.println(" after sorted the velue:" + num);
	
}

}
