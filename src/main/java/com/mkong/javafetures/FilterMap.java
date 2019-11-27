package com.mkong.javafetures;

import java.io.ObjectInputStream.GetField;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class FilterMap {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
	    map.put(1, "linode.com");
	    map.put(2, "heroku.com");
	    map.put(3, "heroku21.com");
		/*
		 * for(Map.Entry<Integer, String> mapfilter : map.entrySet()) {
		 * System.out.println(mapfilter.getKey() +"---"+mapfilter.getValue()); }
		 
	    map.entrySet().stream().filter(x -> "heroku.com".equals(x.getValue())).map(a -> a.getValue()).forEach(System.out::println);
System.out.println("-----------");
*/

Optional<String> gender = Optional.of("MALE");
System.out.println(gender);

System.out.println(Optional.empty());
System.out.println(gender.get());
	

Optional<String> nonEmptyGender = Optional.of("male");
Optional<String> emptyGender = Optional.empty();

System.out.println("Non-Empty Optional:: " + nonEmptyGender.map(String::toUpperCase));
System.out.println("Empty Optional    :: " + emptyGender.map(String::toUpperCase));


Optional<Optional<String>> nonEmptyOtionalGender = Optional.of(Optional.of("male"));
System.out.println("Optional value   :: " + nonEmptyOtionalGender);


StringJoiner str =  new StringJoiner(",");
str.add("ABC");
str.add("WE");
str.add("TY");
str.add("QC");
System.out.println(str);

String result = String.join("-", "2015", "10", "31" );
System.out.println(result);


int[] number = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

// IntStream.of or Arrays.stream, same output
//List<Integer> list = IntStream.of(number).boxed().collect(Collectors.toList());

List<Integer> list = Arrays.stream(number).boxed().collect(Collectors.toList());
System.out.println("list : " + list);


String[] alphabet = new String[]{"A", "B", "C"};




	}

}
