package Step1.src;

public class Person implements Potato
{
   private String PersonName;

   public Person(String name) 
   {
      PersonName = name;
   }

 public void greet()
 {
    System.out.println("["+PersonName+"] Hi guys, I'm "+ PersonName );
 }
 
 public void grumble()
 {
    System.out.println("["+PersonName+"] Grmblblblbl");
 }

}
