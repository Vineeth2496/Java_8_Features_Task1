package com.Java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

//class ConsImpl implements Consumer<String>
//{
//	public void accept(String t) 
//	{
//		System.out.println(t);
//	}
//	
//}
public class ConsumerInterface {

	public static void main(String[] args) 
	{
		List<String> values=Arrays.asList("Kriti Sanon", "Shradha Kapoor", "Sara Ali Khan", "Priyanka Chopra");
		
//		Normal implementation class		
//		Consumer<String> c=new ConsImpl();
		
//		Anonymous inner class implementation		
//		Consumer<String> c=new Consumer<String>() 
//		{
//			public void accept(String t) 
//			{
//			System.out.println(t);	
//			}
//		};
		
//		Instead of Creating Consumer Object of c 
//		Consumer<String> c=t -> System.out.println(t); 
		
		values.forEach(t -> System.out.println(t));

	}

}
