package school;

public class Teacher extends Person{
    private Course courses[] = new Course[4];
    private double meanLevel;
    
    public static Teacher addTeacher(Gender _gender,String _name,int _weight,double _meanLevel)
    {
        Teacher temp = new Teacher(_gender,_name,_weight,_meanLevel);
        addPerson(temp);
        return(temp);
    }
     public void addCourse(Course _course)
    {
        if (!setCourseOK(_course))
            return;
        if (!_course.setTeacherOK(this))
            return;
        _course.setTeacherDoIt(this);
        setCourseDoIt(_course);
    }
    public void setCourseDoIt(Course _course)
    {
        courses[_course.getPeriod()-1] = _course;
    }
    public boolean setCourseOK(Course _course)
    {
        if(_course == null)
        return(false);
        if(courses[_course.getPeriod()-1] != null)
        return(false);
        
        return(true);
    }
    Teacher(Gender _gender,String _name,int _weight,double _meanLevel)
    {
        super(_gender,_name,_weight);
        if(_meanLevel > 10.0)
            _meanLevel = 10;
        else if(_meanLevel < 0.0)
            _meanLevel = _meanLevel;
        meanLevel = _meanLevel;
    }
    public void setMeanLevel(int _meanLevel)
    {
        meanLevel = _meanLevel;
    }
    public double getMeanLevel()
    {
        return (meanLevel);
    }
    public static void printNames()
    {
        System.out.println("----Names----");
        for (Person temp : people)
        {
            if (temp instanceof Teacher)
            {
                System.out.println(temp.getName());
            }
        }
    }
//    public void printStudents()
//    {
//        if(theCourse != null)
//        {
//            if(theCourse.getStudent() != null)
//            {
//            System.out.println(getName() + " teaches " + theCourse.getStudent().getName());
//            }
//            return;
//        }
//            System.out.println(getName() + " teaches no one");
//        
//    }
    
}
