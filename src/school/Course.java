package school;

import java.util.ArrayList;
public class Course {
    enum Type{
        Math, Science, English, Language, History, Elective, PE
    }
    private static ArrayList<Course> courses = new ArrayList<Course>();
    private ArrayList<Student> students = new ArrayList<Student>();
    private Type type;
    private int period;
    private String name;
    public static final int numPeriods = 4;
//    private Student theStudent;
    private Teacher theTeacher;
    
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
    public void addStudent(Student _student)
    {
        if (!setStudentOK(_student))
            return;
        if (!_student.setCourseOK(this))
            return;
        _student.setCourseDoIt(this);
        setStudentDoIt(_student);
    }
    public void setStudentDoIt(Student _student)
    {
        students.add(_student);
    }
    public boolean setStudentOK(Student _student)
    {
        if(_student == null)
            return(false);
        
        for (Student temp : students)
        {
            if (temp == _student)
                return(false);
        }
        return(true);
    }
    public void setTeacherDoIt(Teacher _teacher)
    {
        theTeacher = _teacher;
    }
    public boolean setTeacherOK(Teacher _teacher)
    {
        if(_teacher == null)
            return(false);
        
        if(theTeacher == _teacher)
            return(false);
        
        return(true);
    }
    public boolean addTeacher(Teacher _teacher)
    {
        if (!setTeacherOK(_teacher))
            return(false);
        if (!_teacher.setCourseOK(this))
            return(false);
        _teacher.setCourseDoIt(this);
        setTeacherDoIt(_teacher);
        
        return(true);
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
    public Teacher getTeacher()
    {
        return(theTeacher);
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
