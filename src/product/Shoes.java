package product;

public class Shoes extends Cloth {
    private int size;

    enum kindOf {
        BOOT,
        SPORT,
        SLIPPERS
    }

    Shoes(String name, String seller, String description,long price, String madeIn, String material) {
        super(name, seller, description,price, madeIn, material);
        super.info = " name : " + this.getName() + " seller : " +
                this.getSeller() + " description : " + this.getDescription()+ " price : " + this.getPrice();
    }
}
