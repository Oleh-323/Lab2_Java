import static java.lang.Math.sqrt;

public class Pyramid extends Figures implements Area,Volume{
    private double x; // довжина основи
    private double h; // висота
    private int z; // кількість сторін
    public final int priority;

    public Pyramid(double x, double h, int z, int valueHierarchy) {
        this.x = x;
        this.h = h;
        this.z = z;
        this.priority=valueHierarchy;

    }

    @Override
    public double area() {
        double sideLength = sqrt((getX() / 2) * (getX() / 2) + getH() * getH());
        double areaOneSide = (1.0 / 2) * sideLength * getX();
        double areaFoundation = (getX() * getX() * sqrt(3)) / 4;
        double fullArea = (areaOneSide * getZ() + areaFoundation);

        return fullArea;
    }
@Override
    public double volume() {
        double areaFoundation = (getX() * getX() * sqrt(3)) / 4;
        double volume ;
                volume= (1.0 / 3) * areaFoundation * getH();
       return volume;
    }
    public String toString() {
        return "Pyramid\n\"x=" + x + " h=" + h + " z=" + z+"\nFull area of Pyramid= " + area()+"\nVolume of Pyramid="+volume()+"\n"; }


    public double getH() {
        return h;
    }

    public double getX() {
        return x;
    }

    public int getZ() {
        return z;
    }
    public int getPriority() {
        return priority;
    }
}
