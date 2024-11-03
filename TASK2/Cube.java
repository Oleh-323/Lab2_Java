public class Cube extends Figures implements Area,Volume {
    private double x;
    private double y;
    private double z;
    public final int priority;

    Cube(double x, double y, double z, int valueHierarchy) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.priority= valueHierarchy;


    }
    @Override
    public double area() {
        double fullArea;
        fullArea= (getX() * getY()) * 2 + (getX() * getZ()) * 2 + (getY() * getZ()) * 2;
        //double oneXYArea = (getX() * getY());
        //double oneXZArea = (getX() * getZ());
        //double oneYZArea = (getY() * getZ());
         return fullArea;
        //  System.out.println("One side of cube(x*y)= " + oneXYArea);
        // System.out.println("One side of cube(x*z)=" + oneXZArea);
        //System.out.println("One side of cube(y*z)= " + oneYZArea);
    }

    @Override
    public double volume() {
        double volume;
           volume =  getX() * getY() * getZ();
        return volume;
    }

    public String toString() {
        return "Cube\n\"x=" + x + " y=" + y + " z=" + z+"\nFull area of cube= " + area()+"\nVolume of cube="+volume()+"\n"; }
    private double getY() {
        return y;
    }

    private double getX() {
        return x;
    }

    private double getZ() {
        return z;
    }
    public int getPriority() {
        return priority;
    }
}
