public class Floor {
    private double width;
    private double length;

    public Floor(double width, double height) {
        if (width>=0) {
            this.width = width;
        }else {
            this.width=0;
        }
        if(height>=0) {
            this.length = height;
        }else {
            this.length =0;
        }
    }
    public double getArea(){
        return this.width*this.length;
    }
}
