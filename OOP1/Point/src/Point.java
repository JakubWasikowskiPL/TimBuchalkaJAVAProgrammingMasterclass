public class Point {
    private int x;
    private int y;

    public Point() {

    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance(){
        return  Math.sqrt(( Math.pow(getX(),2))+( Math.pow(getY(),2)));
    }
    public double distance(int x,int y){
        return  Math.sqrt((getX()-x)*(getX()-x)+(getY()-y)*(getY()-y));
    }
    public double distance(Point point){
        return  Math.sqrt((this.x-point.getX())*(this.x-point.getX())+(this.y-point.getY())*(this.y-point.getY()));
    }
}
