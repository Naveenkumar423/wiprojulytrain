package com.wipro.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamDemo3 {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,3,4,7,1,6,8,44,44);
//		int sum=0;
//		for(int num:list)
//		{
//			sum=sum+num;
//		}
			
//		int sum=list.stream()
//		.distinct()		
//		.filter(i->i%2==0)
//		.peek(s->System.out.println(s))
//		.reduce(0,(a,b)->a+b);
		//System.out.println(sum);
		
        list.stream()
		.distinct()		
		.filter(i->i%2==0)
		.sorted(Comparator.reverseOrder())
		.forEach(System.out::println);
	}

}
