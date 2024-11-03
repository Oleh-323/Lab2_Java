public class Rectangle extends Figures  implements Area{
    private double x;
    private double y;
    public final int priority;

    Rectangle(double x, double y, int valueHierarchy) {
        this.x = x;
        this.y = y;
         this.priority=valueHierarchy;}

    @Override
    public double area() {
        double area = getX() * getY();
        return area;

    }

    public String toString() {
        return "Rectangle\n\"x=" + x + " y=" + y +"\nFull area of Rectangle= " + area()+"\n"; }

    public double getY() {
        return y;
    }

    public double getX() {
        return x;
    }
    public int getPriority() {
        return priority;
    }

}
