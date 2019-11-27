package com.mkong.javafetures;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.mkong.javafetures.models.Developer;

public class StreamList {

	public static void main(String[] args) {
		  List<String> lines = Arrays.asList("spring", "node", "mkyong");
		  
		  List<String> lines1 =  lines.stream().filter(x -> !"spring".equals(x)).collect(Collectors.toList());
		  lines1.forEach(System.out::println);
		  
		  
		  
	       List<Developer> developer1 = Arrays.asList(
	    		   new Developer("Akshay", 3456, "232323"),
	    		   new Developer("Zuba", 24, "2234"),
	    		   new Developer("Yadni", 5654, "67"),
	    		   new Developer("Mehul", 445, "786"),
	    		   new Developer("Orient", 56, "657")
	    		   );       
	       
		developer1.stream().map(x -> x.getName().toUpperCase()).forEach(System.out::println);

		System.out.println(">>>>>>>>>>");
		List<Integer> num = Arrays.asList(1, 2, 3, 4, 5);
		num.stream().map(n -> n * 2).forEach(x -> System.out.println(x));

		List<String> items = Arrays.asList("apple", "apple", "banana", "apple", "orange", "banana", "papaya");

	     Map<String, Long> result = items.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	     System.out.println(result);
	
	
	
	}

}
