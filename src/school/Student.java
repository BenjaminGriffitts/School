
package school;

public class Student extends Person{    
    private int gradeLevel;
    private Course theCourse;
    
     public static Student addStudent(Gender _gender,String _name,int _weight,int _gradeLevel)
    {
        Student temp = new Student(_gender,_name,_weight, _gradeLevel);
        addPerson(temp);
        return(temp);
    }
     public void addCourse(Course _course)
    {
        if(theCourse == null)
        {
            theCourse = _course;
            _course.addStudent(this);
        }
    }
    Student(Gender _gender,String _name,int _weight,int _gradeLevel)
    {
        super(_gender,_name,_weight);
        gradeLevel = _gradeLevel;
    }
    public void setGradeLevel(int _gradeLevel)
    {
        gradeLevel = _gradeLevel;
    }
    public int getGradeLevel()
    {
        return (gradeLevel);
    }
    public static void printNames()
    {
        System.out.println("----Names----");
        for (Person temp : people)
        {
            if (temp instanceof Student)
            {
                System.out.println(temp.getName());
            }
        }
    }
    
}
