package Step3.src;

public class Shortcut
{
    private static int storyID = 0; //made storyID static so it is one copy shared accross multiple objects
    private boolean storyCreated = false;
    private boolean storyFinished = true;
    private String PersonName;

    public int getStory()
    {
        return storyID+=1;
    }

    public void takeNewStory()
    {
        if(storyCreated == false && storyFinished == true)
        {
            System.out.println("[Shortcut] Story sc-000"+getStory()+ " created");
            storyCreated = true;
            storyFinished = false;
        }
        else if(storyCreated == true && storyFinished == false)
        {
            System.out.println(PersonName + "I need to finish my task before taking another one");
        }
    }
    public void work()
    {
        if(storyCreated == true && storyFinished == false)
        {
            System.out.println(PersonName + "Ok, working on sc-000"+storyID);
            System.out.println(PersonName + "I am working on sc-000"+storyID+", PR up soon!");
            
        }
        else if(storyCreated == false && storyFinished == true)
        {
            System.out.println(PersonName + "I need a new story!");
        }
    }
    public void finishStory()
    {
        if(storyCreated == true && storyFinished == false)
        {
            System.out.println(PersonName + "sc-000"+storyID+" done, PR up !");
            storyCreated = false;
            storyFinished = true;
        }
        else if(storyCreated == false && storyFinished == true)
        {
            System.out.println(PersonName + "I can't finish something I haven't started");
        }
    }
    /*
    Hi Eddy! Hope this looks good. I had a creative solution if good, and wanted to share with you!
    I let Person inherit Shortcut class and then in the constructor when an instance of person is created, I passed the name
    and using a function "getPersonName" I used this as a setter and was able to solve the multiple inheritence problem without
    multiple interfaces! 
    */

    public void getPersonName(String name) 
    {                                       
        PersonName = name;
        PersonName = "[" + PersonName + "] ";
    }
}