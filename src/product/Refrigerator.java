package product;

public class Refrigerator extends HomeAppliance {

    private int volume;
    private String kindOf;
    private boolean withFreezer;

    Refrigerator(String name, String seller, String description,long price, int energyDegree, boolean isGuaranteed, int volume,
                 String kindOf, boolean withFreezer) {
        super(name, seller, description,price, energyDegree, isGuaranteed);
        this.volume = volume;
        this.kindOf = kindOf;
        this.withFreezer = withFreezer;
        super.info = " name : " + this.getName() + " seller : " +
                this.getSeller() + " description : " + this.getDescription()+ " price : " + this.getPrice();
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getKindOf() {
        return kindOf;
    }

    public void setKindOf(String kindOf) {
        this.kindOf = kindOf;
    }

    public boolean isWithFreezer() {
        return withFreezer;
    }

    public void setWithFreezer(boolean withFreezer) {
        this.withFreezer = withFreezer;
    }
}
