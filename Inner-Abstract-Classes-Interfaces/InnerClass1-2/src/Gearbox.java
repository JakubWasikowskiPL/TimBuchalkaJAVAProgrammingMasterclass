import java.util.ArrayList;

public class Gearbox {
    private ArrayList<Gear>gears;
    private int maxGrars;
    private int currentGear =0;
    private boolean clutschIsIn;


    public Gearbox(int maxGrars) {
        this.maxGrars = maxGrars;
        this.gears=new ArrayList<Gear>();
        Gear neutral= new Gear(0,0.0);
        this.gears.add(neutral);

        for (int i=0;i<maxGrars;i++){
            addGear(i,i*5.3);
        }
    }
    public void operateClutch(boolean in){
        this.clutschIsIn=in;
    }

    public void addGear(int number,double ratio){
        if ((number>0)&&(number<=maxGrars)){
            this.gears.add(new Gear(number,ratio));
        }
    }

    public void changeGear(int newGear){
        if ((newGear>=0)&&(newGear<this.gears.size())&&this.clutschIsIn){
            this.currentGear=newGear;
            System.out.println("Gear "+newGear+" selected.");
        }else {
            System.out.println("Grind!");
            this.currentGear=0;
        }
    }

    public double wheelSpeed(int revs){
        if (clutschIsIn){
            System.out.println("Scream!!!");
            return 0.0;
        }else {
            return revs * gears.get(currentGear).getRatio();
        }
    }
    private class Gear{
        private int gearNumber;
        private double ratio;

        public Gear(int gearNumber, double ratio) {
            this.gearNumber = gearNumber;
            this.ratio = ratio;
        }

        public double getRatio() {
            return ratio;
        }

        public double driveSpeed(int revs){
            return revs*(this.ratio);
        }
    }
}
