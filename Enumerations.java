import java.util.*;

public class Enumerations{
  public static void main(String[]args){
   // Create an Object for Stack
  // Load person class Objects in it
  // Iterate it by using Enumeration
  // print the values by using while Loop

  Stack<Person> s=new Stack<>();
  Person obj1=new Person("Shreyash",22 ,2345);
  Person obj2=new Person("Shrey",22 ,234);
  s.push(obj1);
  s.push(obj2);
  s.push(new Person("Ratan",22,3445));

  Enumeration <Person> e=s.elements();
  while (e.hasMoreElements()) 
  {
     System.out.println("Enumeration => "+e.nextElement());  
  }
  System.out.println("Peek => "+ s.peek());

  }}