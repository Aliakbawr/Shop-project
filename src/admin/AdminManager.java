package admin;

import admin.Admin;
import costumer.Costumer;
import costumer.CostumerManager;

public class AdminManager {
    public Admin admin = Admin.getInstance();

    public void editInfo(String firstName, String lastName, String email, long phoneNumber) {
        admin.setFirstName(firstName);
        admin.setLastName(lastName);
        admin.setEmail(email);
        admin.setPhoneNumber(phoneNumber);
    }
}
