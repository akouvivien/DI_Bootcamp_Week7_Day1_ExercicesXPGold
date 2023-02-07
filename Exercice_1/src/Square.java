public class Square extends Shape{

    public Square() {
    }


    public Square(int height) {
        super(height, height);
    }

    public double getArea(){
        return super.area();
         
    }
    
}