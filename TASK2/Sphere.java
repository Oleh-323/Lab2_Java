import static java.lang.Math.pow;

public class Sphere {
    private double R;
    private final double P = 3.14;

    Sphere(double R) {
        this.R = R;
        System.out.println("Sphere\nR=" + getR() + " P=" + getP() + "\nArea of Sphere=" + area() + "\nVolume of Sphere=" + volume());
    }

    private double volume() {
        double volume = (3.0 / 4.0) * getP() * pow(getR(), 3);
        return volume;
    }

    private double area() {
        double squere = getR() * getR() * getP() * 4;
        return squere;
    }


    public double getR() {
        return R;
    }

    public double getP() {
        return P;
    }
}
