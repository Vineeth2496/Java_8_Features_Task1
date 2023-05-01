package com.Java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPIDemo {

	public static void main(String[] args) 
	{
	Stream s1=Stream.of(10, 5, 2, 1, 3, 4, 6);
	//s1.filter(i -> args i >2 );
	
	ArrayList a=new ArrayList();
	a.add("Anji");
	a.add("Katherine");
	a.add("Angelina");
	a.add("Margott");
	a.add("Gal");
	Stream s2=a.stream();
	//s2.filter(s3 -> s3.startswith("A"));
	//s2.map(n->n.toUpperCase());
	
//	List<String> values=Arrays.asList("Kriti Sanon", "Shradha Kapoor", "Sara Ali Khan", "Priyanka Chopra");
//	values.forEach(n -> System.out.println(n));
	
	
	List<Integer> num=Arrays.asList(6,4,1,5,3,8,9,7);
	
	
//	// Double the values
//	Stream<Integer> data=num.stream();
//	Stream<Integer> mappedData=data.map(n -> n * 2);
//	mappedData.forEach(n -> System.out.println(n));
	
	//	or
	
//	num.stream().map(n -> n* 2).forEach(n -> System.out.println(n));
	
	//or
	
//	num.stream()
//		.filter(n -> n%2 ==1)
//		.sorted()
//		.map(n -> n* 2)
//		.forEach(n -> System.out.println(n));
	
	// adding the sum of the odd numbers

	int result=num.parallelStream()
	.filter(n -> n%2 ==1)
	//.sorted()
	.map(n -> n* 2)
	.reduce(0, (c, e)->c+e);
	System.out.println(result);
	
//	// Sorted values
//	Stream<Integer> sortData=data.sorted();
//	sortData.forEach(n -> System.out.println(n));


//	data.forEach(n -> System.out.println(n));
	

//	// count of integers
//	long count=data.count();
//	System.out.println("Count of List is: "+count);
//	data.forEach(n -> System.out.println(n));

//	// Double with enhanced for loop
//	for(int n : num)
//	{
//		System.out.println(n*2);
//	}

	}

}
 