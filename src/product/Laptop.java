package product;

public class Laptop extends DigitalProduct {


    private String processor;
    private boolean isGaming;

    Laptop(String name, String seller, String description,long price, String operatorSystem, int ram, int storage
            , int area, int weight, String processor, boolean isGaming) {
        super(name, seller, description,price, operatorSystem, ram, storage, area, weight);
        this.processor = processor;
        this.isGaming = isGaming;
        super.info = "\nname : " + this.getName() +"\nseller : " +
                this.getSeller() + "\ndescription : " + this.getDescription()+ "\nprice : " + this.getPrice()
        +"\nStorage : " + this.getStorage();
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public boolean isGaming() {
        return isGaming;
    }

    public void setGaming(boolean gaming) {
        isGaming = gaming;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "processor='" + processor + '\'' +
                ", isGaming=" + isGaming +
                ", name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", seller='" + seller + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", available=" + available +
                ", info='" + info + '\'' +
                '}';
    }
}
