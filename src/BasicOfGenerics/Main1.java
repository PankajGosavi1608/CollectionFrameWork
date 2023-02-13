package BasicOfGenerics;

//Driver class to test above
public class Main1
{
 public static void main (String[] args)
 {
     Test1 <String, Integer> obj =new Test1<String, Integer>("Pankaj", 28);

     obj.print();
 }
}