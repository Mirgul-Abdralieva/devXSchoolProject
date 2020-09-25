package Interface;

public abstract class Person {
    public String fulName;


    public Person(String fulName) {
        this.fulName = fulName;
    }

    public abstract void teaches();
}
