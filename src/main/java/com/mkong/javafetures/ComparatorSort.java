package com.mkong.javafetures;

import java.util.Arrays;
import java.util.stream.Stream;

public class ComparatorSort {

	public static void main(String[] args) {
		/*
		 * List<Developer> dl = new ArrayList<>(); dl.add(new Developer("Akshay", 34,
		 * "49000")); dl.add(new Developer("Raju", 14, "4000")); dl.add(new
		 * Developer("Shahi", 56, "9000")); dl.add(new Developer("Ravi", 97, "8000"));
		 * dl.add(new Developer("Ravi", 97, "8000"));
		 * 
		 * 
		 * 
		 * dl.stream().sorted(Comparator.comparingLong(Developer::getId).reversed()).
		 * collect(Collectors.toMap(Developer::getSalary, Developer::getName,(o,n)->n,
		 * LinkedHashMap::new )).forEach((k,v) -> System.out.println(k +"=="+ v));
		 */
		
		/*
		 * Map<Integer, List<Developer>> groupByPriceMap =
		 * dl.stream().collect(Collectors.groupingBy(Developer::getId));
		 * System.out.println(groupByPriceMap);
		 * 
		 * Map<Integer, List<String>> result = dl.stream().collect(
		 * Collectors.groupingBy(Developer::getId,Collectors.mapping(Developer::getName,
		 * Collectors.toList()))
		 * 
		 * );
		 * 
		 * System.out.println(result);
		 * 
		
		   Stream<String> str = Stream.of("AA","BB","CC","AA",null);
		   str.collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).forEach((a,b)->System.out.println(a+"--"+b));
		   
		List<String> astr=   str.filter(Objects::nonNull).collect(Collectors.toList());
		   
		System.out.println(astr);
		 * 
		 */
		/**

		
		Stream<Integer> istr = Stream.of(2,4,5,3,2,1,23,43);
		 istr.collect(Collectors.toList()).forEach(System.out::println);
	
		 String[] array = {"a", "b", "c", "d", "e"};

		  Supplier<Stream<String>> streamSupplier = () -> Stream.of(array);

		List<String> df = dl.stream().map(s->s.getName()).collect(Collectors.toList());
df.forEach(System.out::println);
		System.out.println("--------------");
		
Map<String, Long> gmap=dl.stream().collect(Collectors.groupingBy(Developer::getName,Collectors.counting()));

gmap.forEach((k,v) -> System.out.println(k+">>>"+v));

Map<String, Integer> sum = dl.stream().collect(
        Collectors.groupingBy(Developer::getName, Collectors.summingInt(Developer::getId)));

sum.forEach((d,f) ->System.out.println(d+"........"+f));

System.out.println("--------------");
List<Integer> df1 = dl.stream().map(s->s.getId()).collect(Collectors.toList());
df1.forEach(System.out::println);
		

		 * System.out.println("================Sorting id============");
		 * Collections.sort(dl, (a1,a2)->a1.getId() - a2.getId());
		 * dl.forEach(System.out::println);
		 * 
		 * 
		 * System.out.println("================Sorting name============");
		 * Collections.sort(dl, (a1,a2)->a1.getName().compareTo(a2.getName()));
		 * dl.forEach(System.out::println);
		 * 
		 * Comparator<Developer> asd = (s1,s2) ->
		 * (s1.getSalary().compareTo(s2.getName())); dl.sort(asd.reversed());
		 * dl.forEach(as -> System.out.println(as.getName()));

Map<String,Integer> hmap = new HashMap<>();		
hmap.put("AA",123);
hmap.put("BB",23);
hmap.put("CC",3);
hmap.put("DD",45);

		/*
		 * for(Map.Entry<String, Integer> mapp : hmap.entrySet()) {
		 * System.out.println(mapp.getKey());
		 * 
		 * System.out.println(mapp.getValue()); }
hmap.forEach((k,v)->{
	
	if("BB".equals(k))
	{
		System.out.println("RRRRRRRRRRR");
	}
	
	
	System.out.println(k +"==="+ v);
});
		
String []str = {"AA","AA","BB","CC","DD","CC"};
List<String>asd = Arrays.asList(str);
	Map<String, Long> ee = asd.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
System.out.println(ee);

Map<String, Long> ee2 = asd.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
System.out.println(ee2);

	
		 */

		/*
		 * Map<String, Integer> unsortMap = new HashMap<>(); unsortMap.put("z", 10);
		 * unsortMap.put("b", 5); unsortMap.put("a", 6); unsortMap.put("c", 20);
		 * unsortMap.put("d", 1); unsortMap.put("e", 7); unsortMap.put("y", 8);
		 * unsortMap.put("n", 99); unsortMap.put("g", 50); unsortMap.put("m", 2);
		 * unsortMap.put("f", 9);
		 * 
		 * System.out.println("Original..."); System.out.println(unsortMap); Map<String,
		 * Integer> result = unsortMap.entrySet().stream()
		 * .sorted(Map.Entry.comparingByKey())
		 * .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldValue,
		 * newValue) -> oldValue, LinkedHashMap::new)); System.out.println(result);
		 * 
		 * System.out.println("============="); Map<String, Integer> result2 = new
		 * LinkedHashMap<>(); unsortMap.entrySet().stream()
		 * .sorted(Map.Entry.comparingByValue()) .forEachOrdered(x ->
		 * result2.put(x.getKey(), x.getValue()));
		 * 
		 * System.out.println(result2);
		 */
		String[][] data = new String[][]{{"a", "b"}, {"c", "d"}, {"e", "f"}};

        //Stream<String[]>
        Stream<String[]> temp = Arrays.stream(data);
temp.forEach(System.out::println);
        //filter a stream of string[], and return a string[]?
        Stream<String[]> stream = temp.filter(x -> "a".equals(x.toString()));

        stream.forEach(System.out::println);
	}
}