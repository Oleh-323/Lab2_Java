import static java.lang.Math.pow;

public class Sphere extends Figures implements Area,Volume{
    private double R;
    private final double P = 3.14;
    public final int priority;

    Sphere(double R , int valueHierarchy ) {
        this.R = R;
        this.priority=valueHierarchy;
        }

    public double volume() {
        double volume = (3.0 / 4.0) * getP() * pow(getR(), 3);
        return volume;
    }

    @Override
    public double area() {
        double squere = getR() * getR() * getP() * 4;
        return squere;
    }

    public String toString() {
        return "Circle\n\"R=" + R +"\nFull area of Circle= " + area()+"\nVolume of Sphere="+volume()+"\n"; }

    private double getR() {
        return R;
    }

    private double getP() {
        return P;
    }
    public int getPriority() {
        return priority;
    }
}
