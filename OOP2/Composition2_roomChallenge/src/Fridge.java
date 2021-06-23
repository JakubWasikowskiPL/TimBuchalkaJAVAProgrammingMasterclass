public class Fridge {
    private String producentName;
    private String energeticEfficiencyClass;
    private int numberOfChambers;
    private boolean builtIn;

    public Fridge(String producentName, String energeticEfficiencyClass, int numberOfChambers, boolean builtIn) {
        this.producentName = producentName;
        this.energeticEfficiencyClass = energeticEfficiencyClass;
        this.numberOfChambers = numberOfChambers;
        this.builtIn = builtIn;
    }
    public void coolingOn(){
        System.out.println("Fridge->Cooling On");
    }
    public void coolingOff(){
        System.out.println("Fridge->Cooling Off");
    }
    public String getProducentName() {
        return producentName;
    }

    public String getEnergeticEfficiencyClass() {
        return energeticEfficiencyClass;
    }

    public int getNumberOfChambers() {
        return numberOfChambers;
    }

    public boolean isBuiltIn() {
        return builtIn;
    }
}
