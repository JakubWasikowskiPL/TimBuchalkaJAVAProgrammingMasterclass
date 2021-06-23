public class Car {

private int doors;
private int wheels;
private String model;
private String engine;
private String colour;

    public void setModel(String model) {
        String validModel=model.toLowerCase();
        if(validModel.equals("carrera")||validModel.equals("commodore")) {
            this.model = model;
        }else {
            this.model="Unknown";
        }
    }

    public String getModel() {
        return model;
    }

    public Car(int doors, int wheels, String model, String engine, String colour) {
        this.doors = doors;
        this.wheels = wheels;
        this.model = model;
        this.engine = engine;
        this.colour = colour;
    }

    public Car() {
    }
}
