package Step3.src;

public class Person extends Shortcut implements Potato 
{
   private String PersonName;
   private String PersonPower = "HIAAAAAAAA !";

   public Person(String name) 
   {
      PersonName = name;
      getPersonName(name); // pass the object name to shortcut class
   }
   public Person(String name, String power) 
   {
      PersonName = name;
      PersonPower = power;
      getPersonName(name); // pass the object name to shortcut class
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

 public void getDummyTrophy() 
 {
   System.out.println("["+PersonName+"] I've been a potato and deserve my dummy trophy");
 }

}
