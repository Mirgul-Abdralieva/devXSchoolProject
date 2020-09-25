package OOP;

public class rectangleDemo {
    public static void main(String[] args){
        rectangle r1 = new rectangle();
        rectangle r2 = new rectangle(2.3f, 4.5f);

        System.out.println(r1.toString());
        System.out.println(r2.toString());
    }
}
