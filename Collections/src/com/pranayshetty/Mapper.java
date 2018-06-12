package com.pranayshetty;
import java.util.*;


public class Mapper {
	public static void main(String[] args) {
		Map<String,String> languages=new HashMap<>();
		
		languages.put("Java", "a compiled ,high level language,a object oriented language");
		languages.put("Python", "a interpreted language that is also object oriented with dynamic semantics");
		languages.put("Algol", "an algorithmic language");
		languages.put("Basic","i dont know man");
		languages.put("Lisp", "Hearing it for the first time");
		System.out.println(languages.get("Java"));
		
		languages.put("Java","This course is about java");
		System.out.println(languages.get("Java"));
		System.out.println("=======================");
		
		for(String keys:languages.keySet()) {
			System.out.println(keys+"    :"+languages.get(keys));
		}
	}

}
