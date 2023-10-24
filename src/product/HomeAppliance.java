package product;

abstract public class HomeAppliance extends Product {
    protected int energyDegree;
    protected boolean isGuaranteed;

    HomeAppliance(String name, String seller, String description, long price, int energyDegree, boolean isGuaranteed) {
        super(name, seller, description, price);
        this.energyDegree = energyDegree;
        this.isGuaranteed = isGuaranteed;
    }

    public int getEnergyDegree() {
        return energyDegree;
    }

    public void setEnergyDegree(int energyDegree) {
        this.energyDegree = energyDegree;
    }

    public boolean isGuaranteed() {
        return isGuaranteed;
    }

    public void setGuaranteed(boolean guaranteed) {
        isGuaranteed = guaranteed;
    }

    @Override
    public String toString() {
        return "HomeAppliance{" +
                "energyDegree=" + energyDegree +
                ", isGuaranteed=" + isGuaranteed +
                ", name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", seller='" + seller + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", available=" + available +
                '}';
    }


}
