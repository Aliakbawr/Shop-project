package product;

public class Television extends HomeAppliance {

    private int resolution;
    private int area;


    Television(String name, String seller, String description,long price, int energyDegree, boolean isGuaranteed, int resolution, int area) {
        super(name, seller, description,price, energyDegree, isGuaranteed);
        this.resolution = resolution;
        this.area = area;
        super.info = " name : " + this.getName() + " seller : " +
                this.getSeller() + " description : " + this.getDescription() + " price : " + this.getPrice();
    }

    public int getResolution() {
        return resolution;
    }

    public void setResolution(int resolution) {
        this.resolution = resolution;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }
}
