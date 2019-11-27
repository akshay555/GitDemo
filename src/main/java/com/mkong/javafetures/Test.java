package com.mkong.javafetures;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Test {

	public static void main(String[] args) {
		/*
		 * List<Student> as = new ArrayList<Student>(); as.add(new Student("Akshay",
		 * "AA", 12121)); as.add(new Student("Zuber", "BB", 12121)); as.add(new
		 * Student("Raksha", "CC", 12121)); as.add(new Student("Tiger", "AA", 12121));
		 * as.add(new Student("Odo", "DD", 12121)); as.add(new Student("Mazib", "AA",
		 * 12121));
		 * 
		 * Predicate<Student> chk = (s1) -> s1.grade.equals("AA");
		 * 
		 * Function<Student, String> fre =
		 * (a)->(a.grade.equals("AA")?"A Grade Student":""); for (Student student : as)
		 * {
		 * 
		 * if(chk.test(student)) { System.out.println(fre.apply(student)); } }
		 * 
		 */
		/*
		 * 
		 * ArrayList<Employee> aemp = new ArrayList<Employee>(); aemp.add(new
		 * Employee("Akshay", "AA", 121)); aemp.add(new Employee("Zuber", "BB", 11));
		 * aemp.add(new Employee("Raksha", "CC", 1121)); aemp.add(new Employee("Tiger",
		 * "AA", 1212)); aemp.add(new Employee("Odo", "DD", 1781)); aemp.add(new
		 * Employee("Mazib", "AA", 8644));
		 * 
		 * ArrayList<Employee> aemp1 = new ArrayList<Employee>(); Predicate<Employee>
		 * eckk = (e) -> e.salary >1121; Function<Employee, Employee> l = (e) -> {
		 * e.salary = e.salary + 5000; return e; };
		 * 
		 * 
		 * 
		 * for (Employee employee : aemp) {
		 * 
		 * if(eckk.test(employee)) { l.apply(employee); aemp1.add(employee); }
		 * 
		 * }
		 * System.out.println(aemp1);
		 */
		
		/*
		 * Function<String,String> test = (q)->q.toUpperCase(); Function<String,String>
		 * test1 = (q)->q.substring(0, 9);
		 * System.out.println(">>>>>>"+test.andThen(test1).apply(
		 * "rrrrrrrrrrrrrrttttttttt"));
		 * System.out.println(">>>>>>"+test.compose(test1).apply(
		 * "rrrrrrrrrrrrrrttttttttt"));
		 */
		
		
		Function<Integer,Integer> square = (s) -> (s * s);

		Function<Integer,Integer> cube = (s) -> (s * s * s);
		
		System.out.println(">> :"+square.andThen(cube).apply(2));
		System.out.println(">><< :"+square.compose(cube).apply(2));
		
	}

}
