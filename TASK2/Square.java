public class Square {
    private double x;//сторона


    Square(double x) {
        this.x = x;

        System.out.println("Square \nX=" + getX());
        System.out.println("Area of Square=" + area() + "\n");
    }

    private double area() {
        double area = getX() * getX();
        return area;
    }

    public double getX() {
        return x;
    }
}
