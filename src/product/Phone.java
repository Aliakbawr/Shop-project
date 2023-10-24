package product;

import javax.xml.stream.events.Comment;
import java.util.ArrayList;

public class Phone extends DigitalProduct {

    private int simCards;
    private int camera;
    public ArrayList<Comment> comments;


    public Phone(String name, String seller, String description,long price,
                 String operatorSystem, int ram, int storage,
                 int area, int weight, int simCards, int camera) {


        super(name, seller, description,price, operatorSystem, ram, storage, area, weight);
        this.simCards = simCards;
        this.camera = camera;

        super.info = "\nname : " + this.getName() +"\nseller : "+ this.getSeller()
                +"\nDescription : "+ this.getDescription()+ "\nprice : " + this.getPrice()
        +"\nOperating System : " + getOperatorSystem() + "\nRam :" + this.getRam() + "\nStorage : " + this.getStorage()
        +"\nArea : " +this.getArea() +"\nweight : " + this.getWeight();
        comments = new ArrayList<>();
    }

    public int getSimCards() {
        return simCards;
    }

    public void setSimCards(int simCards) {
        this.simCards = simCards;
    }

    public int getCamera() {
        return camera;
    }

    public void setCamera(int camera) {
        this.camera = camera;
    }

    @Override
    public String toString() {
        return "Phone{" +
                " name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", seller='" + seller + '\'' +
                ", description='" + description + '\'' +
                ", simCards=" + simCards +
                ", camera=" + camera +
                ", price=" + price +
                ", available=" + available +
                '}';
    }
}
