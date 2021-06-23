public class Kitchen {

    private Wall wall1;
    private Wall wall2;
    private Wall wall3;
    private Wall wall4;
    private Ceiling ceiling;
    private Oven oven;
    private Fridge fridge;
    private KitchenTable kitchenTable;
    private Lamp lamp;

    public Kitchen(Wall wall1, Wall wall2, Wall wall3, Wall wall4, Ceiling ceiling, Oven oven, Fridge fridge, KitchenTable kitchenTable, Lamp lamp) {
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.ceiling = ceiling;
        this.oven = oven;
        this.fridge = fridge;
        this.kitchenTable = kitchenTable;
        this.lamp = lamp;
    }

    public Oven getOven() {
        return oven;
    }

    public Fridge getFridge() {
        return fridge;
    }

    public KitchenTable getKitchenTable() {
        return kitchenTable;
    }

    public Lamp getLamp() {
        return lamp;
    }
}
