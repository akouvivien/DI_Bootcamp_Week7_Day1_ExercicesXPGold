public class App {
    public static void main(String[] args) throws Exception {
        Rectangle rectangle = new Rectangle(5, 10);
        Square square = new Square(5);

       System.out.println(square.getArea()); 
       System.out.println(rectangle.getArea()); 

    }
}
