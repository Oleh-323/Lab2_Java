public class Cube {
    private double x;
    private double y;
    private double z;

    Cube(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
        System.out.println("Cube");
        System.out.println("x=" + x + " y=" + y + " z=" + z);
        area(x, y, z);
        volume(x, y, z);
    }

    public void area(double x, double y, double z) {
        double fullArea = (getX() * getY()) * 2 + (getX() * getZ()) * 2 + (getY() * getZ()) * 2;
        double oneXYArea = (getX() * getY());
        double oneXZArea = (getX() * getZ());
        double oneYZArea = (getY() * getZ());
        System.out.println("Full area of cube= " + fullArea);
        System.out.println("One side of cube(x*y)= " + oneXYArea);
        System.out.println("One side of cube(x*z)=" + oneXZArea);
        System.out.println("One side of cube(y*z)= " + oneYZArea);
    }

    public void volume(double x, double y, double z) {
        System.out.println("Volume of cube=" + getX() * getY() * getZ() + "\n\n");
    }

    public double getY() {
        return y;
    }

    public double getX() {
        return x;
    }

    public double getZ() {
        return z;
    }
}
