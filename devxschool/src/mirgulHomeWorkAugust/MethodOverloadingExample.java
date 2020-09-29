package mirgulHomeWorkAugust;

public class MethodOverloadingExample {
    // Example to illustrate Method Overloading:

    public static int average(int n1, int n2){               // version A
        System.out.println("Run version A");
        return (n1 + n2)/2;
    }
    public static double average(double n1, double n2){      // version B
        System.out.println("Run version B");
        return (n1 + n2) / 2;
    }
    public static int average(int n1, int n2, int n3){       // version C
        System.out.println("Run version C");
        return (n1 + n2 + n3) / 3;
    }

    public static void main(String[] args) {
        System.out.println(average(1, 2));         // Use A
        System.out.println(average(1.0, 2.0));    //  use B
        System.out.println(average(1, 2, 3));    //   use C
        System.out.println(average(1.0, 2));    //    Use B - int 2 implicitly casted to double 2.0

     //   System.out.println(average(1,2,3, 4));       // Compilation Error, red light - No matching method
    }
}

//   Method overloading means that the same method name can have different implementations (versions).
//   However, the different implementations must be distinguishable by their parameter list --->
//   ---> (either the number of parameters, or the type of parameters, or their order).

