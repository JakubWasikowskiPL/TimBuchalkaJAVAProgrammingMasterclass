public class Main {
    // Create a single room of a house using composition.
    // Think about the things that should be included in the room.
    // Maybe physical parts of the house but furniture as well
    // Add at least one method to access an object via a getter and
    // then that objects public method as you saw in the previous video
    // then add at least one method to hide the object e.g. not using a getter
    // but to access the object used in composition within the main class
    // like you saw in this video.
    public static void main(String[] args) {
	Wall wall1=new Wall("West");
	Wall wall2=new Wall("East");
	Wall wall3=new Wall("North");
	Wall wall4=new Wall("South");
    Ceiling ceiling=new Ceiling(12,55);
    Bed bed=new Bed("Modern",4,3,2,1);
    Lamp lamp=new Lamp("Classic",false,75);
    Wall wall5=new Wall("West");
    Wall wall6=new Wall("East");
    Wall wall7=new Wall("North");
    Wall wall8=new Wall("South");
    KitchenTable kitchenTable=new KitchenTable("Classic","wood",4);
    Fridge fridge=new Fridge("Beco","A++",2,false);
    Oven oven=new Oven("A","Electric",2);
    Lamp lamp1=new Lamp("Modern",true,75);

    Bedroom bedRoom=new Bedroom("Jakub`s",wall1,wall2,wall3,wall4,ceiling,bed,lamp);
    bedRoom.makeBed();
    bedRoom.getLamp().turnOn();
    Kitchen kitchen=new Kitchen(wall5,wall6,wall7,wall8,ceiling,oven,fridge,kitchenTable,lamp1);
    kitchen.getFridge().coolingOn();
    kitchen.getOven().heatingOff();
    }
}
