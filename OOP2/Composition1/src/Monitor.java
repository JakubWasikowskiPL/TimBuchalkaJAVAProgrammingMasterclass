public class Monitor {
    private String model;
    private String manufactutrer;
    private int size;
    private Resolution nativeResolution;

    public Monitor(String model, String manufactutrer, int size, Resolution nativeResolution) {
        this.model = model;
        this.manufactutrer = manufactutrer;
        this.size = size;
        this.nativeResolution = nativeResolution;
    }

    public void drawPixelAt(int x, int y, String colour){
        System.out.println("Drawing pixel at "+x+","+y+" in colour "+colour);
    }

    public String getModel() {
        return model;
    }

    public String getManufactutrer() {
        return manufactutrer;
    }

    public int getSize() {
        return size;
    }

    public Resolution getNativeResolution() {
        return nativeResolution;
    }
}
