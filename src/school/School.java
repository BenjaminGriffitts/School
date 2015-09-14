package school;

public class School {

    public static void main(String[] args) {
        Person joe = Person.addPerson(Person.Gender.Male,"Joe",215);
        Person jill = Person.addPerson(Person.Gender.Female,"Jill",85);
        Person jack = Person.addPerson(Person.Gender.Male,"Jack",175);
        Person john = Person.addPerson(Person.Gender.Male,"John",125);
        Person jessica = Person.addPerson(Person.Gender.Female,"Jessica",100);
        jack.getWeight();
        double val = jack.getWeight();
        Person.printNames();
        Person.printNames(Person.Gender.Male);
        System.out.println(jill);
        Person.printWeights();
    }
}
