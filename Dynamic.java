import java.util.Enumeration;
import java.util.Stack;

public class Dynamic{
public static void main(String[]args){
// Create an Object for Stack
  // Load person class Objects in it using push function
  // Iterate it by using List Iterator
  // print the values by using while Loop

  Stack <Person> s=new Stack<>();
  Person obj1=new Person("Shreyash",22,234);
  Person obj2=new Person("Ratan",22,23454);
  s.push(obj1);
  s.push(obj2);
  s.push(new Person("Shre",22,238));

  Enumeration <Person> e=s.elements();
  while (e.hasMoreElements()) 
  {
    System.out.println("Enumeration => "+e.nextElement());  
  }
  System.out.println("Peek => "+s.peek());
  


}
}