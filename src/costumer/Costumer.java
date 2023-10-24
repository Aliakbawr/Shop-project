package costumer;

import factor.PurchaseInvoice;
import product.*;

import java.util.ArrayList;

public class Costumer {

    public ArrayList<Phone> phones_basket;
    public ArrayList<Laptop>laptops_basket;
    public ArrayList<Television> televisions_basket;
    public ArrayList<Refrigerator> refrigerators_basket;
    public ArrayList<Heater> heaters_basket;
    public ArrayList<Dress> dresses_basket;
    public ArrayList<Shoes> shoes_basket;
    public ArrayList<Food> foods_basket;

    public ArrayList<Product> bought;
    public ArrayList<PurchaseInvoice> factors;

    private String userName;
    private String firstName;
    private String lastName;
    private String email;
    private long phoneNumber;
    private String password;
    private long credit;
    private boolean isSigned;
    private int index;
    public String toString = "Username : "+ this.getUserName() +"\nName : "+
            this.firstName +
            " "+ lastName + "\nEmail : " + email +"\nPhone Number : " + phoneNumber + "\nCredit : "
            + credit;

    public Costumer
            (String userName, String firstName, String lastName
            , String email, long phoneNumber, String password) {

        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.password = password;
        this.credit = 0;
        this.index = 0;

        phones_basket = new ArrayList<>();
        televisions_basket = new ArrayList<>();
        laptops_basket = new ArrayList<>();
        heaters_basket = new ArrayList<>();
        shoes_basket = new ArrayList<>();
        refrigerators_basket = new ArrayList<>();
        dresses_basket = new ArrayList<>();
        foods_basket = new ArrayList<>();

        bought = new ArrayList<>();
        factors = new ArrayList<>();
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getCredit() {
        return credit;
    }

    public void setCredit(long credit) {
        this.credit = credit;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public boolean getIsSigned() {
        return isSigned;
    }
    public void setSigned(boolean status) {
        isSigned = status;
    }

    @Override
    public String toString() {
        return "Costumer{" +
                "userName='" + userName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
