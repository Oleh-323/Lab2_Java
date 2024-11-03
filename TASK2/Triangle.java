public class Triangle extends Figures  implements Area {
    private double x;//катет
    private double y;//катет
    public final int priority;

    Triangle(double x, double y,int valueHierarchy) {//прямокутний трикутник*
        this.x = x;
        this.y = y;
        this.priority=valueHierarchy;
    }

    @Override
    public double area() {
        double area = (getX() * getY()) / 2;
        return area;
    }

    public String toString() {
        return "Triangle\nx=" + getX() +" y="+getY()+"\nFull area of Triangle= " + area()+"\n"; }


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
