package Homework8_2;

/*
 * Author:cjlu_19_zx
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;
import java.util.LinkedList;

public class CollectionTest {

	CollectionTest () {
		System.out.println("Test ArrayList:");
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("James");
		arr.add("Tom");
		arr.add("Steven");
		arr.add("Alice");
		arr.add("Bob");
		arr.add("Jerry");
//		System.out.printf("size = %d\n", arr.size());
		
		System.out.println("for循环输出");
		for(int i = 0; i < arr.size(); i++) {
			System.out.println(arr.get(i));
		}
		
		System.out.println("Iterator输出：");
		Iterator<String> it = arr.iterator();
		while(it.hasNext()) {
			String e = it.next();
			System.out.println(e);
			if(e.equals("Tom")) it.remove();
		}
		
		Collections.sort(arr);
		
		System.out.println("for each循环输出:");
		for(String x : arr) {
			System.out.println(x);
		}
		
		System.out.println("=============================");
		System.out.println("Test LinkedList:");
		LinkedList<String> arr2 = new LinkedList<String>();
		arr2.add("Jamse"); arr2.add("Tom"); arr2.add("Steven");
		arr2.add("Alice"); arr2.add("Bob"); arr2.add("Jerry");
		
		System.out.println("Test for:");
		for(int i = 0; i < arr2.size(); i++) {
			System.out.println(arr2.get(i));
		}
		
		System.out.println("Test Iterator");
		Iterator<String> it2 = arr2.iterator();
		while(it2.hasNext()) {
			String e = it2.next();
			System.out.println(e);
			if(it2.equals("Tom")) it2.remove();
		}
		
		Collections.sort(arr2);
		
		System.out.println("Test for each");
		for(String x : arr2) {
			System.out.println(x);
		}
	}
	
	public static void main(String[] args) {
		CollectionTest test = new CollectionTest();
	}

}
