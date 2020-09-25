package OOP.oop1;

public class StaffSubClass extends Person{
    private String school;
    private double pay;

    public StaffSubClass(String name, String address, String school, double pay) {
        super(name, address);
        this.pay = pay;
        this.school = school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    public String getSchool() {
        return school;
    }

    public double getPay() {
        return pay;
    }

    @Override
    public String toString() {
        return "Stuff{Person{" +
                "name='" + getName() + '\'' +
                ",address=" + getAddress() + '\'' +
                ",school=" + school + '\'' +
                ",pay'" + pay + '\''+"}}";
    }
}
