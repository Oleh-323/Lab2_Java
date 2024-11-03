import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {


       List<Figures> figureslist=new ArrayList<>() ;

        figureslist.add( new Cube(4.0, 4.0, 2.0,7));//correct
        figureslist.add( new Pyramid(4.0, 4.0, 2,2));
        figureslist.add(  new Rectangle(4.2, 2,3));

        figureslist.add( new Sphere(5,4));
        figureslist.add(  new Square(4,5));
        figureslist.add(  new Triangle(3, 4,1));
        figureslist.add(new Circle(5,6));

        figureslist.sort((f1, f2) -> Integer.compare(f1.getPriority(), f2.getPriority()));


        for (Figures figure : figureslist) {
            System.out.println(figure);
        }

    }
}
