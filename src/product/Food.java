package product;

public class Food extends Product {

    private String productionDate;
    private String expirationDate;

    Food(String name, String seller, String description,long price, String productionDate, String expirationDate) {
        super(name, seller, description, price);
        this.productionDate = productionDate;
        this.expirationDate = expirationDate;
        super.info = " name : " + this.getName() + " seller : " +
                this.getSeller() + " description : " + this.getDescription()+ " price : " + this.getPrice();
    }

    public String getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(String productionDate) {
        this.productionDate = productionDate;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
