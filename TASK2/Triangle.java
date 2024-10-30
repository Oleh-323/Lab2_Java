public class Triangle {
    private double x;//катет
    private double y;//катет


    Triangle(double x, double y) {//прямокутний трикутник*
        this.x = x;
        this.y = y;
        System.out.println("Triangle \nX=" + getX() + " Y=" + getY());
        System.out.println("Area of Triangle=" + area() + "\n");
    }

    private double area() {
        double area = (getX() * getY()) / 2;
        return area;
    }

    public double getY() {
        return y;
    }

    public double getX() {
        return x;
    }

}
