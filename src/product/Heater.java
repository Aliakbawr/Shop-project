package product;

public class Heater extends HomeAppliance {

    private int flameNum;
    private String material;
    private boolean haveOven;


    Heater(String name, String seller, String description,long price, int energyDegree, boolean isGuaranteed) {
        super(name, seller, description,price, energyDegree, isGuaranteed);
        super.info = " name : " + this.getName() +" seller : " +
                this.getSeller() + " description : " + this.getDescription()+ " price : " + this.getPrice();
    }

    public int getFlameNum() {
        return flameNum;
    }

    public void setFlameNum(int flameNum) {
        this.flameNum = flameNum;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public boolean isHaveOven() {
        return haveOven;
    }

    public void setHaveOven(boolean haveOven) {
        this.haveOven = haveOven;
    }
}
