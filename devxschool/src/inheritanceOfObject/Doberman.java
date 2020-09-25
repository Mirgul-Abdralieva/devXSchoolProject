package inheritanceOfObject;

public class Doberman extends  Dog {
    public Doberman(String name, String breed, int age) {

        super("Chaki", "doberman", 3);
    }
        @Override
        public void voice() {
            super.voice();
            System.out.println("I am Chaki and I can bark! Gav-Gav");
        }

        @Override
        public void gav() {
            super.gav();
            System.out.println("Gav from Doberman!");

        }
}
