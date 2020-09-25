package OOP;

public class rectangle {
    public float Length;
    public float width;

    public rectangle(){
        this.Length = 1.0f;
        this.width = 1.0f;
    }

    public rectangle(float Length,float width){
        this.Length = Length;
        this.width = width;
    }

    public float getLength() {
        return Length;
    }

    public void setLength(float length) {
        Length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public void getArea(){
        double area = getLength() * getWidth();
        System.out.println(area);
    }

    public void  getPerimeter(){
        double perimeter = (getLength()+getWidth())*2;
    }

    @Override
    public String toString() {
        return "rectangle{" +
                "Length=" + Length +
                ", width=" + width +
                '}';
    }
}
