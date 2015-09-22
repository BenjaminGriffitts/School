
package school;

public class Student extends Person{
    
    private int gradeLevel;
    
     public static Student addStudent(Gender _gender,String _name,int _weight,int _gradeLevel)
    {
        Student temp = new Student(_gender,_name,_weight, _gradeLevel);
        addPerson(temp);
        return(temp);
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
    
}
