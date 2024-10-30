public class Rectangle {
    private double x;
    private double y;


    Rectangle(double x, double y) {
        this.x = x;
        this.y = y;
        System.out.println("Rectangle");
        System.out.println("x=" + x + " y=" + y);
        area();
    }

    public void area() {
        double area = getX() * getY();
        System.out.println("Area=" + area + "\n");

    }

    public double getY() {
        return y;
    }

    public double getX() {
        return x;
    }

}
