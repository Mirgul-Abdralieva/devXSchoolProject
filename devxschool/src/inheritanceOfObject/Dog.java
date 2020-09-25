package inheritanceOfObject;

public class Dog {
    String name;
    String breed;
    int age;

    public Dog(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + "BigDog" + '\'' +
                ", breed='" + "Haskins"+ '\'' +
                ", age=" + 9 +
                '}';
    }

    public void voice(){
        System.out.println("Hello World!");
    }

    public void gav(){
        System.out.println("Gav from Dog!");}
}
