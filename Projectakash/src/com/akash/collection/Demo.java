package com.akash.collection;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		List <String> list= Arrays.asList("akash","vinod","pise");
 
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
