package com.akash.collection;

import java.util.HashSet;

public class Demo2 {

	public static void main(String[] args) {
		HashSet<Integer> se = new HashSet<Integer>();
		se.add(6);
		se.add(4);
		se.add(3);
		se.add(2);
		
		for (Integer i : se) {
			System.out.println(i);
		}
	}

}
