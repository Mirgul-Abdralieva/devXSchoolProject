package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class RemovingElementsFromArrayList {
    public static void main(String[] args) {
        List<String>programmingLanguages = new ArrayList<>();

        programmingLanguages.add("C");
        programmingLanguages.add("C++");
        programmingLanguages.add("Java");
        programmingLanguages.add("Kotlin");
        programmingLanguages.add("Python");
        programmingLanguages.add("Perl");
        programmingLanguages.add("Ruby");

        System.out.println("Initial List: " + programmingLanguages);
        // remove the element at index '5'
        programmingLanguages.remove(0);
        System.out.println(programmingLanguages);
        // remove " Kotlin"
        programmingLanguages.remove(3);
        System.out.println(programmingLanguages);
        // Remove all the elements that exist in a given collection
        programmingLanguages.remove(1 );
        System.out.println(programmingLanguages);
        // Remove all elements from the ArrayList
        programmingLanguages.clear();
        System.out.println(programmingLanguages);
    }
}


/**
 # Output
 Initial List: [C, C++, Java, Kotlin, Python, Perl, Ruby]
 After remove(5): [C, C++, Java, Kotlin, Python, Ruby]
 After remove("Kotlin"): [C, C++, Java, Python, Ruby]
 */