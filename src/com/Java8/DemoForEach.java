package com.Java8;

import java.util.Arrays;
import java.util.List;

public class DemoForEach {

	public static void main(String[] args) 
	{
		List<String> values=Arrays.asList("Katherine", "Margott", "Gal Gadot");
		
//		for(int i=0; i<values.size(); i++)
//		{
//			System.out.println(values.get(i));
//		}
		
//		for(String i : values)
//		{
//			System.out.println(i);
//		}
		
		values.forEach(i -> System.out.println(i));
	}

}
