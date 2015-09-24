package school;

public class School {

    public static void main(String[] args) {
        Person joe = Person.addPerson(Person.Gender.Male,"Joe",215);
        Student jill = Student.addStudent(Person.Gender.Female,"Jill",85,11);
        Student jack = Student.addStudent(Person.Gender.Male,"Jack",175,11);
        Student john = Student.addStudent(Person.Gender.Male,"John",125,10);
        Student jessica = Student.addStudent(Person.Gender.Female,"Jessica",100,9);
        Student benjamin = Student.addStudent(Person.Gender.Male,"Benjamin",170,12);
        
        jack.getWeight();
        int val = jack.getWeight();
        Person.printNames();
        Person.printNames(Person.Gender.Male);
        System.out.println(jill);
        
        Course geom = Course.addCourse(Course.Type.Math, "Geometry", 1);
        Course photo = Course.addCourse(Course.Type.Elective, "Photography", 2);
        Course weights = Course.addCourse(Course.Type.PE, "Weights",3);
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
        Student jared = Student.addStudent(Person.Gender.Male,"Jared",105,10);
        jason.addCourse(photo);
        
        //Student jason = new Student(Person.Gender.Male,"Jason",165,12);
        System.out.println(jason.getName());
        System.out.println(jared.getName());
        Person.printNames();
        Student.printNames();
    }
}
