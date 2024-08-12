public class Person
{
   String Name;
   String Age;
   String Sal;
   
   public Person(String Name,int age,int sal)
   {
    this.Name=Name;
    this.Age=Age;
    this.Sal=Sal;

   }

   @Override
   public String toString() {
      return "Persons [Name=" + Name + ", Age=" + Age + ", Sal=" + Sal + "]";
   }
   

}