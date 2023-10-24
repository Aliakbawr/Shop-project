package product;

import java.util.ArrayList;

public class ProductManager {


    public static ArrayList<Product> products;
    public static ArrayList<Dress> dresses;
    public static ArrayList<Dress> dresses_requests;
    public static ArrayList<Food> foods;
    public static ArrayList<Food> foods_requests;
    public static ArrayList<Heater> heaters;
    public static ArrayList<Heater> heaters_requests;
    public static ArrayList<Laptop> laptops;
    public static ArrayList<Laptop> laptops_requests;
    public static ArrayList<Phone> phones;
    public static ArrayList<Phone> phones_requests;
    public static ArrayList<Refrigerator> refrigerators;
    public static ArrayList<Refrigerator> refrigerators_requests;
    public static ArrayList<Shoes> shoes;
    public static ArrayList<Shoes> shoes_requests;
    public static ArrayList<Television> televisions;
    public static ArrayList<Television> televisions_requests;

    public ProductManager() {

        this.phones = new ArrayList<>();
        this.phones_requests = new ArrayList<>();
        this.televisions = new ArrayList<>();
        this.televisions_requests = new ArrayList<>();
        this.refrigerators = new ArrayList<>();
        this.refrigerators_requests = new ArrayList<>();
        this.foods = new ArrayList<>();
        this.foods_requests = new ArrayList<>();
        this.shoes = new ArrayList<>();
        this.shoes_requests = new ArrayList<>();
        this.dresses = new ArrayList<>();
        this.dresses_requests = new ArrayList<>();
        this.laptops = new ArrayList<>();
        this.laptops_requests = new ArrayList<>();
        this.heaters = new ArrayList<>();
        this.heaters_requests = new ArrayList<>();
        this.products = new ArrayList<>();
    }

    public void add_phone(String name, String seller, String description,long price,
                          String system, int ram, int storage, int area, int weight, int simCards, int camera) {
        Phone phone = new Phone(name, seller, description,price, system, ram, storage
                , area, weight, simCards, camera);
        phones_requests.add(phone);
        products.add(phone);
    }

    public void add_laptop(String name,String seller,String description,long price,String system,int ram,int storage,int area,
                           int weight,String processor,boolean isGaming)
    {
        Laptop laptop = new Laptop(name,seller,description,price,system,ram,storage,area,weight,processor,isGaming);
        laptops_requests.add(laptop);
        products.add(laptop);
    }

    public void add_television(String name, String seller, String description,long price,
                               int degree, boolean guaranty, int quality, int size) {
        Television television = new Television(name, seller, description,price,
                degree, guaranty, quality, size);
        televisions_requests.add(television);
        products.add(television);
    }

    public void add_refrigerator(String name, String seller, String description,long price,
                                 int degree, boolean guaranty, int volume,String kind, boolean haveRefrigerator)
    {
        Refrigerator refrigerator = new Refrigerator(name,seller,description,price,degree,
                guaranty,volume,kind,haveRefrigerator);
        refrigerators_requests.add(refrigerator);
        products.add(refrigerator);
    }
}
