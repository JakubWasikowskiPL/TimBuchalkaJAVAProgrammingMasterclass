public class Dog extends Animal{

    private int eyes;
    private int legs;
    private int tale;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int weight, int eyes,int legs, int tale, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes=eyes;
        this.legs=legs;
        this.tale=tale;
        this.teeth=teeth;
        this.coat=coat;

    }

    private void chew(){
        System.out.println("Dog.chew() called");
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat() called");
        chew();
        super.eat();
    }
    public  void  walk(){
        System.out.println("Dog.walk() called");
        super.move(5);//in this case methode move from class Dog won`t be executed, only method move from Animal class will be executed
    }
    public void run(){
        System.out.println("Dog.run() called");
        move(10);
    }
    private void moveLegs(int speed){
        System.out.println("Dog.moveLegs() called");
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog.move() called");
        moveLegs(speed);
        super.move(speed);
    }
}
