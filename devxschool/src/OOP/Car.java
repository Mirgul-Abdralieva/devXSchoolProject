package OOP;

public class Car {

    protected   int year;
    private String model;
    public String color;
    private  int speed;
    String manufacturer;

   public Car(){
       this.model = "chevrolet";
   }

    public void setManufacturer (String man){
        manufacturer=man;
    }

    public  void  setModel(String model){
        model = model;
    }

    public void accelerate(){
        speed++;
    }

    public void slowDown(){
        speed--;
    }

}
