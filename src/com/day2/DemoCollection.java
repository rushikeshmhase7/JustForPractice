package com.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class DemoCollection {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> al=new ArrayList();
		al.add(12);
		al.add(4);
		al.add(8);
		al.add(6);
		al.add(9);
		System.out.println(al);
		Collections.sort(al, (o1,o2)->(o1>o2)?1:(o1<o2)?-1:0);
		System.out.println(al);
		
		
		
		TreeSet<String> ts=new TreeSet<String>((o1,o2)->o2.compareTo(o1));
		ts.add("vedant");
		ts.add("ajay");
		ts.add("rushi");
		ts.add("tushar");
		System.out.println(ts);
		
		
	}

}
