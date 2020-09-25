package OOP.oop1;

import java.util.ArrayList;

public class PersonDemo {
    public static void main(String[] args) {

        Person person = new Person("Bob", "6204 N Claremont ave, 60659, Chicago");
        System.out.println(person);

        StudentSubClass studentSubClass = new StudentSubClass("Robin", "6204 N Claremont ave", "Java Core", 2020, 20.20);
        System.out.println(studentSubClass);

        Person stuff = new StaffSubClass("Test","street1","school",1000.0);
        System.out.println(stuff);

        ArrayList<Person> personArrayList = new ArrayList<>();
        personArrayList.add(studentSubClass);
        personArrayList.add(stuff);

        System.out.println(personArrayList);

    }
}
