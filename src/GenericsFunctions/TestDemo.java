package GenericsFunctions;

import java.util.ArrayList;

public class TestDemo {
	
	// Java program to demonstrate that NOT using
	// generics can cause run time exceptions
	  
	    public static void main(String[] args)
	    {
	        // Creatinga an ArrayList without any type specified
	        ArrayList al = new ArrayList();
	  
	        al.add("Sachin");
	        al.add("Rahul");
	        al.add(10); // Compiler allows this
	  
	        String s1 = (String)al.get(0);
	        String s2 = (String)al.get(1);
	  
	        // Causes Runtime Exception
	        String s3 = (String)al.get(2);
	    }
	}

//
//Output :
//
//Exception in thread "main" java.lang.ClassCastException: 
//   java.lang.Integer cannot be cast to java.lang.String
//    at Test.main(Test.java:19)

//Advantages of Generics: 
//Programs that use Generics has got many benefits over non-generic code. 
//
//1. Code Reuse: We can write a method/class/interface once and use it for any type we want.
//
//2. Type Safety: Generics make errors to appear compile time than at run time (It’s always better 
//to know problems in your code at compile time rather than making your code fail at run time). Suppose you 
//want to create an ArrayList that store name of students, and if by mistake the programmer adds an integer 
//object instead of a string, the compiler allows it. But, when we retrieve this data from ArrayList, it causes 
//problems at runtime.