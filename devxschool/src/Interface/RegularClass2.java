package Interface;

public class RegularClass2 implements Interface1, Interface2{
    public int sum = AGE + 4;

    @Override
    public void read() {
        System.out.println("I am reading");
    }

    @Override
    public void walk() {
        System.out.println("I am walking");
    }

    public static void main(String[] args) {
        int preSchoolEducation = AGE;
        int count = 7;
        if (count < preSchoolEducation){
            System.out.println("You can not study with us");
        }
        else {
            System.out.println("You can study with us");
        }

        RegularClass2 object = new RegularClass2();
        System.out.println(object.sum);
        object.read();
        object.walk();
    }

    //Difference

    // Interface ---> when we create some variable, we have to create variable with uppercase (public, static, final/constant)
    //           ---> we can implements from many interface classes (it can be implements multiple interfaces)
    //           ---> we have to use key word - "implements"
    //           ---> inside of interface classes always contains public, static variables(final), methods. It means don't have to write worrds "public, static, final"

    // Abstract  --> we can create any variables (it can be public, private, default etc.)
    //           --> we can extends from abstract class only one time and only from one abstract class
    //           ---> we have to use key word - "extends"

    //same
    // methods without body
}
