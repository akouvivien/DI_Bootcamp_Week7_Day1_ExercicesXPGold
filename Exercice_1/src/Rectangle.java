public class Rectangle extends Shape {

    public Rectangle() {
    }


    public Rectangle(int width, int height) {
        super(width, height);
    }

    public double getArea(){
        return super.area();
    }
    
}