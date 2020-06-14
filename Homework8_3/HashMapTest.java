package Homework8_3;

/*
 * Author:cjlu_19_zx
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapTest {
	HashMapTest () {
		HashMap<String, Student> stu = new HashMap<String, Student>();
		stu.put("19H002", new Student("19H002", "孙悟空", 2000));
		stu.put("19H001", new Student("19H001", "唐僧", 40));
		stu.put("19H003", new Student("19H003", "猪八戒", 1000));
		stu.put("19H004", new Student("19H004", "沙僧", 900));
		stu.put("19H005", new Student("19H005", "小龙马", 800));
		
		System.out.println("学号19H003的学生:");
		System.out.println(stu.get("19H003"));
		

		System.out.println("所有学生:");
		String name;
		String number;
		int age;
		Iterator<Entry<String, Student>> it = stu.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry<String, Student> entry = it.next();
			name = entry.getValue().getName();
			number = entry.getKey();
			age = entry.getValue().getAge();
			System.out.println(number + ", " + name + ", " + age);
			if(name.equals("小龙马")) it.remove();
		}

		System.out.println("删除小龙马后，所有学生：");
		Iterator<Entry<String, Student>> iter = stu.entrySet().iterator();
		Collection<String> arr = new ArrayList<String>();
		while(iter.hasNext()) {
			Map.Entry<String, Student> entry = iter.next();
			arr.add(entry.getValue().toString());
		}
		Object[] obj = arr.toArray();
		for(String x : arr) {
			System.out.println(x);
		}
	}
	
	public static void main(String[] args) {
		HashMapTest test = new HashMapTest();
	}

}
