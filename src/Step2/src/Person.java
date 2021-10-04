package Step2.src;

public class Person implements Potato
{
   private String PersonName;
   private String PersonPower = "HIAAAAAAAA !";

   public Person(String name) 
   {
      PersonName = name;
   }
   public Person(String name, String power) 
   {
      PersonName = name;
      PersonPower = power;
   }

 public void greet()
 {
    System.out.println("["+PersonName+"] Hi guys, I'm "+ PersonName );
 }
 
 public void grumble()
 {
    System.out.println("["+PersonName+"] Grmblblblbl");
 }

 public void invokePower()
 {
    System.out.println("["+PersonName+"] "+PersonPower);
 }

 public String getName()
 {
    return PersonName;
 }

}
