package product;

abstract public class DigitalProduct extends Product {

    private String operatorSystem;
    private int ram;
    private int storage;
    private int area;
    private int weight;

    DigitalProduct(String name, String seller, String description, long price, String operatorSystem,
                   int ram, int storage, int area, int weight) {
        super(name, seller, description, price);
        this.operatorSystem = operatorSystem;
        this.ram = ram;
        this.storage = storage;
        this.area = area;
        this.weight = weight;
    }

    public String getOperatorSystem() {
        return operatorSystem;
    }

    public void setOperatorSystem(String operatorSystem) {
        this.operatorSystem = operatorSystem;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
