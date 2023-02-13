
//Here, we are using the ArrayList class, but you can use any collection class 
//such as ArrayList, LinkedList, HashSet, TreeSet, HashMap, Comparator etc.

package AdvantagesOfGenerics;

import java.util.ArrayList;
import java.util.Iterator;


public class GenericsInJava {
	
	public static void main(String args[]){  
		ArrayList<String> list=new ArrayList<String>();  
		list.add("Pankaj");  
		list.add("jai");  
		//list.add(32);//compile time error  
		  
		String s=list.get(1);//type casting is not required  
		System.out.println("element is: "+s);  
		  
		Iterator<String> itr=list.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
		}  
		}  

		


