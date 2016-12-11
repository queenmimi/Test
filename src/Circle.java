/**
 * Created by Yangyang on 2016/12/11.
 */
public class Circle {
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    private double radius;

    public void DoIt(){
        System.out.print(this.radius);
    }

    private Circle(double radius) {
        this.radius = radius;
    }
    private static Circle circle;

    public static Circle getInstance(double radius){
        circle=new Circle(123.5);
        return  circle;
    }
}
