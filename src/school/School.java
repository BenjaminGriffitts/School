package school;

public class School {

    public static void main(String[] args) {
        
        Student joe = Student.addStudent(Person.Gender.Male,"Joe",215,9);
        Student jill = Student.addStudent(Person.Gender.Female,"Jill",85,11);
        Student jack = Student.addStudent(Person.Gender.Male,"Jack",175,11);
        Student john = Student.addStudent(Person.Gender.Male,"John",125,10);
        Student jessica = Student.addStudent(Person.Gender.Female,"Jessica",100,9);
        Student benjamin = Student.addStudent(Person.Gender.Male,"Benjamin",170,12);
        Student jason = Student.addStudent(Person.Gender.Male,"Jason",165,12);
        Student jared = Student.addStudent(Person.Gender.Male,"Jared",105,10);
        Student jose = Student.addStudent(Person.Gender.Male,"Jose",110,11);
        Student juanita = Student.addStudent(Person.Gender.Female,"Juanita",95,10);
        
        Teacher johnson = Teacher.addTeacher(Person.Gender.Male,"Mr. Johnson",185,4.1);
        Teacher jones = Teacher.addTeacher(Person.Gender.Female,"Mrs. Jones",100,2.3);
        Teacher cortez = Teacher.addTeacher(Person.Gender.Male,"Mr. Cortez",250,8.7);
        Teacher smith = Teacher.addTeacher(Person.Gender.Female,"Mrs. Smith",120,0.5);
        
        jack.getWeight();
        int val = jack.getWeight();
        Person.printNames();
        Person.printNames(Person.Gender.Male);
        System.out.println(jill);
        
        Course geom = Course.addCourse(Course.Type.Math, "Geometry", 1);
        Course photo = Course.addCourse(Course.Type.Elective, "Photography", 2);
        Course weights = Course.addCourse(Course.Type.PE, "Weights",3);
        Course bio = Course.addCourse(Course.Type.Science, "Biology",4);
        
        photo.addStudent(jason);
        photo.addTeacher(johnson);
        geom.addStudent(jack);
        geom.addTeacher(cortez);
        weights.addStudent(jose);
        weights.addTeacher(jones);
        bio.addStudent(jill);
        bio.addTeacher(smith);
        
        Course.printNames();
        System.out.println(photo);
        
        System.out.println("----Age----");
        benjamin.setBirthdate(17,9,1998);
        System.out.println(benjamin.getAge());
        benjamin.setBirthdate(18,9,1998);
        System.out.println(benjamin.getAge());
        benjamin.setBirthdate(19,9,1998);
        System.out.println(benjamin.getAge());
        
        System.out.println(jason.getName());
        System.out.println(jared.getName());
        System.out.println(johnson.getMeanLevel());
        
        Person.printNames();
        Student.printNames();
        Teacher.printNames();

//        cortez.printStudents();
    }
}
