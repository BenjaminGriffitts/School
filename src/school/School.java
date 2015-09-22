package school;

public class School {

    public static void main(String[] args) {
        Person joe = Person.addPerson(Person.Gender.Male,"Joe",215);
        Person jill = Person.addPerson(Person.Gender.Female,"Jill",85);
        Person jack = Person.addPerson(Person.Gender.Male,"Jack",175);
        Person john = Person.addPerson(Person.Gender.Male,"John",125);
        Person jessica = Person.addPerson(Person.Gender.Female,"Jessica",100);
        Person benjamin = Person.addPerson(Person.Gender.Male,"Benjamin",170);
        
        jack.getWeight();
        int val = jack.getWeight();
        Person.printNames();
        Person.printNames(Person.Gender.Male);
        System.out.println(jill);
        
        Course geom = Course.addCourse(Course.Type.Math, "Geometry", 1);
        Course photo = Course.addCourse(Course.Type.Elective, "Photography", 2);
        Course.printNames();
        System.out.println(photo);
        
        System.out.println("----Age----");
        benjamin.setBirthdate(17,9,1998);
        System.out.println(benjamin.getAge());
        benjamin.setBirthdate(18,9,1998);
        System.out.println(benjamin.getAge());
        benjamin.setBirthdate(19,9,1998);
        System.out.println(benjamin.getAge());
        
        Student jason = Student.addStudent(Person.Gender.Male,"Jason",165,12);
        
        //Student jason = new Student(Person.Gender.Male,"Jason",165,12);
        System.out.println(jason.getName());
    }
}
