package nightClass;

public class StaticMethods {

    public static void main(String[] args) {
        //  John Doe
        StaticMethods.helloMessage("John Doe");  // helloMessage("John Doe"); no need create an Object,
    }

    // hello John
    //
    public static void  helloMessage(String name){
        System.out.println("Hello" + name);
    }
}
