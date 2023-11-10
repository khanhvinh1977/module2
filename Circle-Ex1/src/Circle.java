public class Circle {
    private double  PI = 3.1415;
    private double radius;


    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getPrimier() {

        return Math.pow(radius,2)*PI;
    }


}


