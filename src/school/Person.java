package school;

import java.util.ArrayList;
import java.util.Calendar;
public class Person {
    enum Gender{
        Male, Female
    }

    protected static ArrayList<Person> people = new ArrayList<Person>();
    private int weight;
    private Gender gender;
    private String name;
    
    
    private int birthDay;
    private int birthMonth;
    private int birthYear;
    
    public static Person addPerson(Gender _gender,String _name,int _weight)
    {
        Person temp = new Person(_gender,_name,_weight);
        people.add(temp);
        return(temp);
    }
    public static void addPerson(Person _person)
    {
        people.add(_person);
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
    public void setBirthdate(int _day, int _month, int _year)
    {
        birthDay = _day;
        birthMonth = _month;
        birthYear = _year;
    }
    public int getAge()
    {
        Calendar now = Calendar.getInstance();
        int day = now.get(Calendar.DAY_OF_MONTH);
        int month = now.get(Calendar.MONTH) + 1;
        int year = now.get(Calendar.YEAR);
        int age = year - birthYear;
        if(birthMonth==month && birthDay>day)
        {
            age--;
        }
        else if(birthMonth>month)
        {
            age--;
        }

        return age;
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
