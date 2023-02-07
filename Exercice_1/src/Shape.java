public class Shape {

    protected int width;
    protected int height;

    public Shape() {
        super();

    }

    public Shape(int width, int height) {
        super();
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return this.width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return this.height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

     public int area(){
        return width * height;
    }
    
}