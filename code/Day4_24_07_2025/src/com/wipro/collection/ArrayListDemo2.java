package com.wipro.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		 
		ArrayList<Integer> list= new ArrayList<>();
		list.add(1);//0
		list.add(2);//1
		list.add(4);//2
		list.add(5);//3
		list.add(4);//4
		
	    //System.out.println(list.contains(21));
		System.out.println(list.indexOf(5));
		
//		for(int i=0;i<list.size();i++)
//		{
//			System.out.println(list.get(i));
//		}
		
//		for(Integer i:list)
//		{
//			System.out.println(i);
//			
//		}
		
//		Iterator it= list.iterator();
//		
//		while(it.hasNext())
//		{
//			System.out.println(it.next());
//		}
		
		System.out.println(list);
		
	}

}
