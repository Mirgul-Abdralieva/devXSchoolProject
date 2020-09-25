package Interface;

public abstract class Abstract1 {
    public String name;
    private  int age = 5;

    public Abstract1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public  void setAge(int age){
        this.age = age;
    }

    public abstract void speak();
}
