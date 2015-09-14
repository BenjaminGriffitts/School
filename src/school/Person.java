package school;

import java.util.ArrayList;
public class Person {
    enum Gender{
        Male, Female
    }

    private static ArrayList<Person> people = new ArrayList<Person>();
    private int weight;
    private Gender gender;
    private String name;
    
    public static Person addPerson(Gender _gender,String _name,int _weight)
    {
        Person temp = new Person(_gender,_name,_weight);
        people.add(temp);
        return(temp);
    }
    
    Person()
    {
        name = "Danielson";
        gender = Gender.Male;
        weight = 150;
    }
    Person(Gender _gender,String _name,int _weight)
    {
        gender = _gender;
        name = _name;
        weight = _weight;
    }
    
    public String getName()
    {
        return(name);
    }
    public int getWeight()
    {
        return(weight);
    }
    public Gender getGender()
    {
        return(gender);
    }
    public void setName(String _name)
    {
        name = _name;
    }
    public void setWeight(int _weight)
    {
        weight = _weight;
    }
    public void setGender(Gender _gender)
    {
        gender = _gender;
    }
    public static void printNames()
    {
        System.out.println("----Names----");
        for (Person temp : people)
        {
            if (temp != null)
            {
                System.out.println(temp.getName());
            }
        }
    }
    public static void printNames(Gender _gender)
    {
        System.out.println("----Names By Gender----\n" + _gender + "s:");
        for (Person temp : people)
        {
            if (temp != null)
            {
                if (temp.gender == _gender)
                {
                    System.out.println(temp.getName());
                }
            }
        }
    }
    public String toString()
    {
        return(name + " " + gender + " " + weight);
    }
        
}
