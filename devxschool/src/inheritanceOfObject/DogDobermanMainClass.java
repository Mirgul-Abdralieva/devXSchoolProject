package inheritanceOfObject;

public class DogDobermanMainClass {
    public static void main(String[] args) {
        Doberman doberman = new Doberman("Chaki", "doberman", 3);

               System.out.println(doberman.name + " " + doberman.breed + " " + doberman.age);
                System.out.println(doberman);
        System.out.println("`````````````````");
                 doberman.voice();
                 doberman.gav();
    }
    }
