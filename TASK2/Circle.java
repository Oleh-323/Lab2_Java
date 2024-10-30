public class Circle {
    private double R;//радіус
    private final double P = 3.14;//число пі

    Circle(double R) {
        this.R = R;

        System.out.println("Circle \nR=" + getR() + " P=" + getP());
        System.out.println("Squere of Circle=" + area() + "\n");
    }

    private double area() {
        double squere = getR() * getR() * getP();
        return squere;
    }


    public double getP() {
        return P;
    }

    public double getR() {
        return R;
    }
}
