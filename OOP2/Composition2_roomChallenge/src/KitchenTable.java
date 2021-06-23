public class KitchenTable {
    private String style;
    private String material;
    private int numberOfLegs;

    public KitchenTable(String style, String material, int numberOfLegs) {
        this.style = style;
        this.material = material;
        this.numberOfLegs = numberOfLegs;
    }

    public String getStyle() {
        return style;
    }

    public String getMaterial() {
        return material;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }
}
