package GenericsUsingMap;

public class TestGenerics {

	public static void main(String args[]){  
		MyGen<Integer> m=new MyGen<Integer>();  
		m.add(2);  
		//m.add("Pankaj");//Compile time error  
		System.out.println(m.get());  
		}}  
//
//A class that can refer to any type is known as a generic class. 
//Here, we are using the T type parameter to create the generic class of specific type.
//
//Let's see a simple example to create and use the generic class.

//The T type indicates that it can refer to any type (like String, Integer, and Employee).
//The type you specify for the class will be used to store and retrieve the data.
//
//Using generic class:
//Let's see the code to use the generic class.