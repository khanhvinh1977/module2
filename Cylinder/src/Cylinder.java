public class Cylinder extends Circle {
    private double hight;

    public Cylinder(double radius, double hight) {
        super(radius);
        this.hight = hight;
    }

    public double getHight() {
        return hight;
    }

    public void setHight(double hight) {
        this.hight = hight;
    }

    public double Thetich (){
        return area()*hight;
    }



}
