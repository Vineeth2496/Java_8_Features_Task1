package com.Java8;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;

public class DateTimeDemo {

	public static void main(String[] args) 
	{
	
		
		LocalDate d=LocalDate.now();
		LocalDate d1=LocalDate.of(1996, Month.APRIL, 02);
		System.out.println(d+ " : "+d1);
		
		LocalTime t=LocalTime.now();
		LocalTime t1=LocalTime.of(12, 34, 56, 789);
		LocalTime t2=LocalTime.now(ZoneId.of("Australia/Melbourne"));
		LocalTime t3=LocalTime.now(ZoneId.of("Canada/Yukon"));
		LocalTime t4=LocalTime.now(ZoneId.of("Hongkong"));
		LocalTime t5=LocalTime.now(ZoneId.of("GMT"));
		System.out.println(t+" :: "+t1);
		System.out.println("Melbourne Time: "+ t2);
		System.out.println("Yukon Time: "+ t3);
		System.out.println("Hongkong Time: "+ t4);
		System.out.println("GMT Time:"+ t5);
		LocalDateTime dt=LocalDateTime.now();
		System.out.println(dt);
		
		Instant i=Instant.now();
		System.out.println("Instant Time now with Zone:"+i);
		
		for(String s : ZoneId.getAvailableZoneIds())
		{
			System.out.println(s);
		}

	}

}
