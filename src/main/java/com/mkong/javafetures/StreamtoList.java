package com.mkong.javafetures;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import com.mkong.javafetures.models.Developer;

public class StreamtoList {

	public static void main(String[] args) {
	Stream<String> str = Stream.of("Java","DotNet","ass");
	List<String> slist = str.filter(a -> !"Java".equals(a)).collect(Collectors.toList());
	slist.forEach(System.out::println);
	
	 String[] array = {"a", "b", "c", "d", "e"};
	 int [] intaa = {3,5,7,8,32,12,3};
     //Arrays.stream
     Stream<String> stream1 = Arrays.stream(array);
     stream1.forEach(x -> System.out.println(x));
     
     Stream<String> stream2 = Stream.of(array);
     stream2.forEach(x -> System.out.println(x));

	
	IntStream intarr = Arrays.stream(intaa);
	intarr.forEach(System.out::println);
	
	
	
	 List<Developer> developer = Arrays.asList(
  		   new Developer("Akshay", 3456, "232323"),
  		   new Developer("Zuba", 24, "2234"),
  		   new Developer("Zuba", 24, "2234"),
  		   new Developer("Yadni", 5654, "67"),
  		   new Developer("Mehul", 445, "786"),
  		   new Developer("Orient", 56, "657")
  		   );
	
	Map<String, String> gmap = developer.stream().collect(Collectors.toMap(Developer::getName, Developer::getSalary,(o,n)->n));
	
	System.out.println(gmap);
	
	
	}

}
