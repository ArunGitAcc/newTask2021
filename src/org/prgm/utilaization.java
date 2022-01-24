package org.prgm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class utilaization {

	
	public static void main(String[] args) {
		
		bank a= new bank();
		a.setUserid(123);
		a.setUsername("Arun");
		
		int userid = a.getUserid();
		String username = a.getUsername();
		System.out.println(userid);
		System.out.println(username);
		

		bank b= new bank();
		b.setUserid(123);
		b.setUsername("Arun");
		
		int userid1 = b.getUserid();
		String username1 = b.getUsername();
		System.out.println(userid1);
		System.out.println(username1);
		
		List<bank> li=new ArrayList<>();
		li.add(a);
		li.add(b);
		
		System.out.println("****************");
		
		
		for (int i = 0; i < li.size(); i++) {
			
			bank bankA = li.get(i);
			int userid2 = bankA.getUserid();
			String username2 = bankA.getUsername();
			System.out.println(userid2);
			System.out.println(username2);
			}
		
		Set<bank> se= new HashSet<>();
		se.add(a);
		se.add(b);
	System.out.println("************");
	
	
	for (bank bank : se) {
		
		System.out.println(bank.getUserid());
		System.out.println(bank.getUsername());
	}

	Map<Integer, bank> mp= new HashMap<>();
	Set<Entry<Integer, bank>> entrySet = mp.entrySet();
	System.out.println("************");
	
	
	for (Entry<Integer, bank> entry : entrySet) {
		bank value = entry.getValue();
		int userid2 = value.getUserid();
		String username2 = value.getUsername();
		System.out.println(userid2);
		System.out.println(username2);
	}
	
	}
}