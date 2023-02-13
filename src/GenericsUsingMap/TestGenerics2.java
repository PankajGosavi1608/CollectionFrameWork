package GenericsUsingMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TestGenerics2 {
	
	public static void main(String args[]){  
		Map<Integer,String> map=new HashMap<Integer,String>();  
		map.put(1,"Pankaj");  
		map.put(4,"Uday");  
		map.put(2,"Gosavi");  
		  
		//Now use Map.Entry for Set and Iterator  
		Set<Map.Entry<Integer,String>> set=map.entrySet();  
		  
		Iterator<Map.Entry<Integer,String>> itr=set.iterator();  
		while(itr.hasNext()){  
		Map.Entry e=itr.next();//no need to typecast  
		System.out.println(e.getKey()+" "+e.getValue());  
		}  
		  
		}}  

//Output
//
//1 Pankaj
//2 Gosavi 
//4 Uday


