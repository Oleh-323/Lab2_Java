public class Circle extends Figures implements Area {
    private double R;//радіус
    private final double P = 3.14;//число пі
    public final int priority;
    Circle(double R,int valueHierarchy) {
        this.R = R;
        this.priority=valueHierarchy;
    }
    @Override
    public double area() {
        double squere = getR() * getR() * getP();
        return squere;
    }

    public String toString() {
        return "Circle\n\"R=" + R +"\nFull area of Circle= " + area()+"\n"; }
    public double getP() {
        return P;
    }

    public double getR() {
        return R;
    }
    public int getPriority() {
        return priority;
    }
}
