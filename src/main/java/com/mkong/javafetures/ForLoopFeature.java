package com.mkong.javafetures;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForLoopFeature {

	public static void main(String[] args) {
		Map<String,Integer> mapdta = new HashMap<>();
		mapdta.put("DS", 1213);
		mapdta.put("RE", 322);
		mapdta.put("TY", 33);
		mapdta.put("VF", 43);
		
		for(Map.Entry<String, Integer> mapal : mapdta.entrySet())
		{
			System.out.println(mapal.getKey());
		}
		
		mapdta.forEach((k ,v)->System.out.println("Item : " + k + " Count : " + v));
		
		List<String> items = new ArrayList<>();
		items.add("A");
		items.add("B");
		items.add("C");
		items.add("D");
		items.add("E");

		items.forEach(x -> System.out.println(x));
		System.out.println("------------");
		items.stream().filter(x ->x.equals("C")).findAny().ifPresent(System.out::println);
		
	}

}
