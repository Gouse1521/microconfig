package arrayList;

import java.util.HashMap;
import java.util.Map;

public class HashMapEX1 {

	public static void main(String[] args) {
		HashMap<Integer,String> hp1= new HashMap<>();
		hp1.put(1, "Mayu");
		hp1.put(2, "Gouse");
		hp1.put(3, "shaik");
		
		hp1.put(1, "Shaik Mayu");
		
		System.out.println(hp1.put(1, "Hi"));
		
		for(Map.Entry<Integer, String> kv: hp1.entrySet()) {
			
			//System.out.println(kv);
			System.out.println(kv.getKey() +" " +kv.getValue());
		}
		
		for (Integer id: hp1.keySet())         //iteration over keys  
		{  
			String name=hp1.get(id);   
			System.out.println("key :"+id +" Value :"+name);
		}
		hp1.forEach((k,v) -> System.out.println("Key re: "+ k + ", Value re: " + v)); 
		
	}

}
