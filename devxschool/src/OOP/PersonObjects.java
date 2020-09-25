package OOP;

public class PersonObjects {
    String name;
    int age;
    char gender;

    public PersonObjects(String name, int age, char gender){
        this.name =name;
        this.age = age;
        this.gender = gender;
    }

    public PersonObjects(char gender) {
        this.gender = 'M';
    }


    public PersonObjects(int age) {
        this.age = 17;
    }

    public PersonObjects(String name) {
        this.name = "Mike";
    }


    public void speak(){
        System.out.println("I can speak!");
    }
    public  void study(){
        System.out.println("Go study!");
    }
}
