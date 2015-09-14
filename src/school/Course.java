package school;

import java.util.ArrayList;
public class Course {
    enum Type{
        Math, Science, English, Language, History, Elective, PE
    }
    private static ArrayList<Course> courses = new ArrayList<Course>();
    private Type type;
    private int period;
    private String name;
    
    public static Course addCourse(Type _type,String _name,int _period)
    {
        Course temp = new Course(_type,_name,_period);
        courses.add(temp);
        return(temp);
    }
    Course()
    {
        name = "English 101";
        type = Type.English;
        period = 1;
    }
    Course(Type _type,String _name,int _period)
    {
        type = _type;
        name = _name;
        period = _period;
    }
    public String getName()
    {
        return(name);
    }
    public int getPeriod()
    {
        return(period);
    }
    public Type getType()
    {
        return(type);
    }
    public void setName(String _name)
    {
        name = _name;
    }
    public void setPeriod(int _period)
    {
        period = _period;
    }
    public void setType(Type _type)
    {
        type = _type;
    }
    public static void printNames()
    {
        System.out.println("----Names----");
        for (Course temp : courses)
        {
            if (temp != null)
            {
                System.out.println(temp.getName());
            }
        }
    }
    public static void printNames(Type _type)
    {
        System.out.println("----Names By Type----\n" + _type + "s:");
        for (Course temp : courses)
        {
            if (temp != null)
            {
                if (temp.type == _type)
                {
                    System.out.println(temp.getName());
                }
            }
        }
    }
    public String toString()
    {
        return(name + " " + type + " " + period);
    }
}
