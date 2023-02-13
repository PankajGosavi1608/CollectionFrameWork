package GenericsFunctions;

public class Main1{
	
	   // Driver class to test above

	    public static void main(String[] args)
	    {
	        // instance of Integer type
	        Test1<Integer> iObj = new Test1<Integer>(15);
	        System.out.println(iObj.getObject());
	  
	        // instance of String type
	        Test1<String> sObj= new Test1<String>("PankajGosavi");
	        System.out.println(sObj.getObject());
	  //remove cmnt to run      iObj = sObj; // This results an error
	    }
	}

//Output: 
//
//error:
// incompatible types:
// Test cannot be converted to Test 