public class Circle {
    public final double PI = 3.1415;
    public double radius;

    public Circle (double radius) {
    this.radius=radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double area (){
        return Math.pow(radius,2)*PI;
    }

}
