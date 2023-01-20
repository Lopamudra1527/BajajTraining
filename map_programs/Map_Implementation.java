package com.java.map_programs;

import java.util.*;
import java.util.Map.Entry;

public class Map_Implementation {
   
	public void hashMap()
	 {
		
	 Map<Integer, String> m =new HashMap<Integer,String>();
	 m.put(1,"Lopa");
	 m.put(2,"Mukesh");
	 m.put(3,"Joshi");
	 m.put(4,"Ram");
	 for(Map.Entry map:m.entrySet())
	 {
		 int key=(int)map.getKey();
		 String value=(String)map.getValue();
		 System.out.println(key+" "+value);
	 }
	 }
	public void linkedHashMap()
	{
		Map<Integer, String> m =new LinkedHashMap<Integer,String>();
		 m.put(1,"Lopa");
		 m.put(2,"Mukesh");
		 m.put(3,"Joshi");
		 m.put(4,"Ram");
		 Set map=m.entrySet();
		 Iterator it=map.iterator();
		 while(it.hasNext())
		 {
			 Map.Entry entry=(Map.Entry)it.next();
			 System.out.println(entry.getKey()+" "+entry.getValue());
		 }
	}
	public void treeMap()
	{
		Map<Integer, String> m =new TreeMap<Integer,String>();
		 m.put(1,"Lopa");
		 m.put(2,"Ram");
		 m.put(3,"Joshi");
		 m.put(3,"Mukesh");
		 System.out.println(m.entrySet());
		 for(Map.Entry map:m.entrySet())
			 System.out.println(map.getKey()+" "+map.getValue());
		 {
			 
		 }
	}
}


