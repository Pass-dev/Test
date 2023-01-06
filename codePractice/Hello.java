 package codePractice;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class Hello {
	 public static void main(String[] args) {
	        
	          List arr = new ArrayList();
	        arr.add("hi");
	        arr.add("hello");
	        arr.add('h');
	        arr.add(10);
//	        arr.remove(3);
	        
	        for (int r=0; r<arr.size();r++){
	            System.out.println(arr.get(r));
	        }
	    
	
	 Hashtable<String, String> h = new Hashtable<String,String>();
	 
	 h.put("y","sd");
	 h.put("h","ad");
	 
	 System.out.println(h.get("h"));
	 System.out.println(h.keySet());
	 for (String name: h.keySet()){
         System.out.println(name);
	 }
	 for (String values: h.values()){
         System.out.println(values);
	 }
	 }
}
