package seller;

import java.util.ArrayList;

public class SellerManager {

    public static ArrayList<Seller> sellers;

    public static ArrayList<Seller> requests;

    public SellerManager(){this.sellers = new ArrayList<>();
        this.requests = new ArrayList<>();}

    public void request_new_seller(String username, String firstname, String lastname,
                                   String email, long phoneNumber, String company, String password)
    {
        requests.add(new Seller(username,firstname,lastname,email,phoneNumber,password,company));
    }

    public String showInfo(String username) {
        String info = null;
        for (Seller seller : sellers)
        {
            if(seller.getUserName().equals(username))
            {
                info = "\nUsername : "+ seller.getUserName() +"\nName : " + seller.getFirstName() +" "
                        + seller.getLastName() +"\nEmail : " +seller.getEmail() +"\nPhone Number "
                        + seller.getPhoneNumber();
            }
        }
        return info;
    }

    public void editInfo(String userName,String newUsername,String newFirstN,String newLastN
            ,String newEmail,String newPassword,long newPhoneN,String companyName) {


        for (int i = 0 ; i < sellers.size() ; i++)
        {
            if (sellers.get(i).getUserName().equals(userName))
            {
                sellers.get(i).setUserName(newUsername);
                sellers.get(i).setFirstName(newFirstN);
                sellers.get(i).setLastName(newLastN);
                sellers.get(i).setEmail(newEmail);
                sellers.get(i).setPhoneNumber(newPhoneN);
                sellers.get(i).setPassword(newPassword);
                sellers.get(i).setFactoryName(companyName);
                break;
            }
        }
    }

}
