package OOP;

import java.util.Objects;

public class PersonObjectsDemo {
    public static void main(String[] args) {
        PersonObjects personObjects = new PersonObjects("Kate", 24, 'F');
        System.out.println(personObjects.age + " " + personObjects.gender + " " + personObjects.name);
        personObjects.speak();
        personObjects.study();
        PersonObjects personObjects1 = new PersonObjects("Mike",17,'M');
        System.out.println(personObjects1.age + " " + personObjects1.gender + " " + personObjects1.name);
    }
}
