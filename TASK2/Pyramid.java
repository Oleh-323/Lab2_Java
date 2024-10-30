import static java.lang.Math.sqrt;

public class Pyramid {
    private double x; // довжина основи
    private double h; // висота
    private int z; // кількість сторін

    public Pyramid(double x, double h, int z) {
        this.x = x;
        this.h = h;
        this.z = z;
        System.out.println("Pyramid");
        System.out.println("x=" + x + " h=" + h + " z=" + z);
        area();
        volume();
    }

    private void area() {
        double sideLength = sqrt((getX() / 2) * (getX() / 2) + getH() * getH());
        double areaOneSide = (1.0 / 2) * sideLength * getX();
        double areaFoundation = (getX() * getX() * sqrt(3)) / 4;
        double fullArea = (areaOneSide * getZ() + areaFoundation);
        System.out.println("Lateral Area of Side=" + areaOneSide);
        System.out.println("Foundation Area=" + areaFoundation);
        System.out.println("Full Area=" + fullArea);
    }

    private void volume() {
        double areaFoundation = (getX() * getX() * sqrt(3)) / 4;
        double volume = (1.0 / 3) * areaFoundation * getH();
        System.out.println("Volume=" + volume + "\n");
    }

    public double getH() {
        return h;
    }

    public double getX() {
        return x;
    }

    public int getZ() {
        return z;
    }
}
