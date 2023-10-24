package costumer;

import comment.Comments;
import product.Product;
import product.ProductManager;

import javax.xml.stream.events.Comment;
import java.util.ArrayList;

public class CostumerManager {

    static ProductManager productManager = new ProductManager();
    public static ArrayList<Costumer> costumers;

    public CostumerManager(){this.costumers = new ArrayList<Costumer>();}

    public static void add_New_Costumer(String username,String firstName,String lastName,
                       String email,long phoneNumber,String password)
    {
        costumers.add(new Costumer(username,firstName,lastName,email,phoneNumber,password));
    }

    public static boolean editInfo(String userName, String newUsername, String newFirstN, String newLastN
            , String newEmail, String newPassword, long newPhoneN) {

        boolean found = false;

        for (int i = 0 ; i < costumers.size() ; i++)
        {
            if (costumers.get(i).getUserName().equals(userName))
            {
                costumers.get(i).setUserName(newUsername);
                costumers.get(i).setFirstName(newFirstN);
                costumers.get(i).setLastName(newLastN);
                costumers.get(i).setEmail(newEmail);
                costumers.get(i).setPhoneNumber(newPhoneN);
                costumers.get(i).setPassword(newPassword);

                found = true;
                break;
            }
        }
        return found;
    }

    public static String showInfo(String username)
    {
        String info = null;
        for (Costumer costumer : costumers)
        {
            if(costumer.getUserName().equals(username))
            {
                info = costumer.getUserName() +" " + costumer.getFirstName() +" "
                        + costumer.getLastName() +" " +costumer.getEmail() +" "
                        + costumer.getPhoneNumber();
            }
        }
        return info;
    }

    public static void add_comment(String name,String product,String text)
    {
        for (int i = 0; i < costumers.size(); i++) {
            if (costumers.get(i).getUserName().equals(name))
            {
                for (int j = 0; j < productManager.phones.size(); j++) {
                    if (productManager.phones.get(j).getName().equals(product))
                    {

                    }
                }
            }
        }
    }
}
