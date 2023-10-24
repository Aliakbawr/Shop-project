package product;

public class Dress extends Cloth {

    private int size;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    private enum clothKind {
        T_SHIRT,
        PANTS,
        JACKET,
        SKIRT
    }

    Dress(String name, String seller, String description,long price, String madeIn, String material, int size) {
        super(name, seller, description,price, madeIn, material);
        this.size = size;
        super.info = " name : " + this.getName() + " seller : " +
                this.getSeller() + " description : " + this.getDescription()+ " price : " + this.getPrice();
    }
}
