package Step3.src;

public final class Sale extends Person {

    public Sale(String name)
    {
        super(name);
    }

    public void grumble()
    {
        System.out.println("["+super.getName()+"] Grmblblblbl");
        System.out.println("["+super.getName()+"] Not gonna hit my target");
    }

    public void getDummyTrophy() 
    {
        System.out.println("["+getName()+"] Uuuum what ?");
    }
    
}
