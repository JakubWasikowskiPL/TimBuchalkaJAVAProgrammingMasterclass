public class Circle {
    private double radius;

    public Circle(double radius) {
        if (radius>=0) {
            this.radius = radius;
        }else {
            this.radius=0;
        }
    }

    public double getRadius() {
        return radius;
    }
    public double getArea(){
        return Math.PI*Math.pow(radius,2);
    }
}
