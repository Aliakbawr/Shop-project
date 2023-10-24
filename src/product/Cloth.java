package product;

abstract public class Cloth extends Product {

    private String madeIn;
    private String material;

    Cloth(String name, String seller, String description,long price, String madeIn, String material) {
        super(name, seller, description,price);
        this.madeIn = madeIn;
        this.material = material;
    }

    public String getMadeIn() {
        return madeIn;
    }

    public void setMadeIn(String madeIn) {
        this.madeIn = madeIn;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

}
