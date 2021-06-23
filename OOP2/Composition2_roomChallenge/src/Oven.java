public class Oven {
    private String energeticEfficiencyClass;
    private String heatSource;
    private int numberOfChambers;

    public Oven(String energeticEfficiencyClass, String heatSource, int numberOfChambers) {
        this.energeticEfficiencyClass = energeticEfficiencyClass;
        this.heatSource = heatSource;
        this.numberOfChambers = numberOfChambers;
    }
    public void heatingOn(){
        System.out.println("Oven->Heating on");
    }
    public void heatingOff(){
        System.out.println("Oven->Heating off");
    }
    public String getEnergeticEfficiencyClass() {
        return energeticEfficiencyClass;
    }

    public String getHeatSource() {
        return heatSource;
    }

    public int getNumberOfChambers() {
        return numberOfChambers;
    }
}
