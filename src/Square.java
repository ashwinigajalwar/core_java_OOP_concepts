public class Square implements Drawable{
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Square");
    }

    public double calculateArea(){
        return side * side;
    }
}
