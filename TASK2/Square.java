public class Square extends Figures  implements Area {
    private double x;//сторона
    public final int priority;

    Square(double x,int valueHierarchy) {
        this.x = x;
        this.priority=valueHierarchy;

    }

    @Override
    public double area() {
        double area = getX() * getX();
        return area;
    }
    public String toString() {
        return "Square\nx=" + x +"\nFull area of cube= " + area()+"\n"; }


    public double getX() {
        return x;
    }
    public int getPriority() {
        return priority;
    }
}
