package com.mkong.javafetures;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.mkong.javafetures.models.Developer;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       List<Developer> developer = Arrays.asList(
    		   new Developer("Akshay", 3456, "232323"),
    		   new Developer("Zuba", 24, "2234"),
    		   new Developer("Yadni", 5654, "67"),
    		   new Developer("Mehul", 445, "786"),
    		   new Developer("Orient", 56, "657")
    		   );
       
       
       
       developer.forEach(System.out::println);

       developer.forEach(x -> System.out.println(x.getId()));
       
       System.out.println("Sorting ");
     Collections.sort(developer,new Comparator<Developer>() {

		@Override
		public int compare(Developer o1, Developer o2) {
			
			return o2.getId() - o1.getId();
		}
	});
       

     developer.forEach(System.out::println);
     
     
     System.out.println("----------------Sorting --------->>-----------");
     Comparator<Developer> developer1= Comparator.comparing(Developer::getId);  
     Collections.sort(developer,developer1);  
     for(Developer st: developer){  
         System.out.println(st.getId()+" "+st.getName());  
         }    
     
     System.out.println("----------------Sorting --------------------");
     developer.sort((o1, o2)->o1.getId() - o2.getId());	
     
    }
}
