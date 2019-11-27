package com.mkong.javafetures;

import java.util.function.Function;
import java.util.function.Predicate;

public class FuntionalTest {

	public static void main(String[] args) {
		
		Function<String,String> af = (s)->s.toUpperCase();
		System.out.println(af.apply("akshay"));
		
		
		Function<Integer,Integer> ad = (s)->s*s;
		System.out.println(ad.apply(4));
		
		Function<String,Integer> rad = (s) ->s.length() - s.replace(" ", "").length();
		System.out.println(">>>"+rad.apply("ABC DFF dsfsd sdfdsf"));
		
		
		Predicate<String> pchk = (s)->s.equals("AKSHAY");
		System.out.println(">>"+pchk.test("AKSHAY1"));
		

	}

}
