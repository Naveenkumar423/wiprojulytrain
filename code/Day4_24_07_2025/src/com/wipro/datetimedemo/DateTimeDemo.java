package com.wipro.datetimedemo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeDemo {

	public static void main(String[] args) {
		 
		LocalDate dt= LocalDate.now();
		System.out.println(dt);
		 
		DateTimeFormatter formatter1=DateTimeFormatter.ofPattern("dd-MM-yyyy");
		System.out.println(dt.format(formatter1));
//		LocalDate dt1=LocalDate.of(2025, 6, 12);
//		System.out.println(dt1);
//		
//		LocalDate dt2=LocalDate.of(2025, Month.APRIL, 12);
//		System.out.println(dt2);
		
		LocalDate dt3=LocalDate.ofEpochDay(5);
		System.out.println(dt3);
		
//		LocalDateTime dtm1=LocalDateTime.now();
//		System.out.println(dtm1);
//		
//		DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd-MM-yyyy  HH:mm:ss");
//		System.out.println(dtm1.format(formatter));
//		
//		
//		LocalTime dtm2=LocalTime.now();
//		System.out.println(dtm2);
//		
//		LocalDate dt11= LocalDate.of(1990, 1, 10);
//		System.out.println(getAge(dt11));
//		ZonedDateTime  z= ZonedDateTime.now(ZoneId.of("Europe/London"));
//		
//		
//		System.out.println(z.format(formatter));
 
	 
	}
	
	public static int getAge(LocalDate dt)
	{
		
	
		return 0;
	}

	public static void getDateDiff(LocalDate dt1,LocalDate dt2)
	{
		// difference is D days M months and M years
		
	}
	
	public static boolean isLeapYear(LocalDate dt)
	{
		return true;
		
	}
}
