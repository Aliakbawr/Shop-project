import admin.AdminManager;
import admin.AdminPanel;
import costumer.Costumer;
import costumer.CostumerManager;
import costumer.CostumerPanel;
import product.ProductManager;
import seller.SellerManager;
import seller.SellerPanel;

import java.util.Scanner;

public class All_Panels {
    CostumerManager costumerManager = new CostumerManager();
    CostumerPanel costumerPanel = new CostumerPanel();
    SellerPanel sellerPanel = new SellerPanel();
    AdminManager adminManager = new AdminManager();
    AdminPanel adminPanel = new AdminPanel();
    SellerManager sellerManager = new SellerManager();
    ProductManager productManager = new ProductManager();

    Scanner scanner = new Scanner(System.in);

    public void main_Panel() {

        for (Costumer costumer : costumerManager.costumers) {
            costumer.setSigned(false);
        }

        System.out.println("\nSelect : (1-3) \n\n1.---{User Panel}\n2.---{Product Panel}\n3.---{Exit program}");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                log_Panel();
                break;
            case 2:
                show_all_product();
                break;
            case 3:
                System.out.println("Good Luck !");
                System.exit(1);
                break;
            default:
                System.out.println("{!} Unexpected value: " + choice);main_Panel();
        }

    }

    public void log_Panel()
    {
        System.out.println("Select : (1-3)\n" +
                "\n1.---{register}\n2.---{signIn}\n3.---{Main Panel}");

        int choice = scanner.nextInt();

        switch (choice)
        {
            case 1 : sign_Up();break;

            case 2 : signInPanel(); break;

            case 3 : main_Panel();break;

            default: System.out.println("Unexpected value: " + choice); log_Panel();

        }

        main_Panel();
    }

    public void sign_Up()
    {

        String newUsername,newFirstN,newLastN,newEmail,newPassword,newCompany;

        long newPhoneN;

        System.out.println("--- ENTER {USERNAME} : ");
        newUsername = scanner.next();

        System.out.println("--- ENTER {FIRSTNAME} : ");
        newFirstN = scanner.next();

        System.out.println("--- ENTER {LASTNAME} : ");
        newLastN = scanner.next();

        System.out.println("--- ENTER EMAIL : ");
        newEmail = scanner.next();

        System.out.println("--- ENTER {PHONE-NUMBER} : ");
        newPhoneN = scanner.nextLong();

        System.out.println("--- ENTER {PASSWORD} : ");
        newPassword = scanner.next();

        System.out.println("--- Choose roll : (1-2)" +
                "\n1.---{costumer}\n2.---{seller}");

        int choice = scanner.nextInt();

        if (choice == 2)
        {
            System.out.println("Enter {company name} : ");
            newCompany = scanner.next();

            sellerManager.request_new_seller(newUsername,newFirstN,newLastN,newEmail, newPhoneN,newCompany,newPassword);
            System.out.println("---{Please Wait for admin to confirm}---\n");

        } else
        {

            costumerManager.add_New_Costumer(newUsername, newFirstN, newLastN, newEmail, newPhoneN, newPassword);
            System.out.println("---{registered successfully}---\n");

        }
        log_Panel();
    }

    public void signInPanel()
    {

        System.out.println("Enter {username} : ");
        String username = scanner.next();

        System.out.println("Enter {password} : ");
        String password = scanner.next();

        System.out.println("Choose Roll : (1-3)\n" +
                "\n1.---{costumer}\n2.---{seller}\n3.---{admin}");

        int choice = scanner.nextInt();

        switch (choice)
        {
            case 1 :
                boolean found01 = false;
                for (int i = 0;i < costumerManager.costumers.size();i++)
                {
                    if (costumerManager.costumers.get(i).getUserName().equals(username)
                            && costumerManager.costumers.get(i).getPassword().equals(password))
                    {
                        found01 = true;
                        costumerManager.costumers.get(i).setSigned(true);
                        System.out.println("Welcome, {" + costumerManager.costumers.get(i).getFirstName() + " "
                        +costumerManager.costumers.get(i).getLastName() + "} !");
                        costumerPanel.costumer_Panel(username);
                        break;
                    }
                }
                if (found01 == false)
                {
                System.out.println("{!} Could not find user");
                signInPanel();
                }
            case 2 :{
                boolean found = false;
                for (int i = 0;i<sellerManager.sellers.size();i++)
                {
                    if(sellerManager.sellers.get(i).getUserName().equals(username)
                    && sellerManager.sellers.get(i).getPassword().equals(password))
                    {
                        found = true;
                        System.out.println("Welcome, {" + sellerManager.sellers.get(i).getFirstName() + " "
                        + sellerManager.sellers.get(i).getLastName() + "} !");
                        sellerPanel.seller_Panel(username);
                    }
                }if (found == false)
                {
                    System.out.println("{!} Could not find user");
                    signInPanel();
                }
            }
                sellerPanel.seller_Panel(username);break;
            case 3 : {
                if (username.equals("admin") && password.equals("admin")) {
                    System.out.println("Welcome , " + adminManager.admin.getFirstName());
                    adminPanel.admin_Panel();
                    log_Panel();
                } else
                    System.out.println("{!} Wrong info");
                signInPanel();
                break;
            }

            default: System.out.println("{!} Unexpected value: " + choice);
        }
        main_Panel();
    }


    public void products_menu()
    {
        System.out.println("Select :" +
                "\n1- All products" +
                "\n2- Search product" +
                "\n3- Filter product");
        int choice = scanner.nextInt();
        switch (choice)
        {
            case 1:
                show_all_product();
                break;
            case 2:
                search_product();
                break;
        }
    }
    public void search_product()
    {
        System.out.println("Enter name of product : ");
        String nameOfProduct = scanner.next();

        boolean notFound = true;
        for (int i = 0; i < productManager.products.size(); i++) {
            if (productManager.products.get(i).equals(nameOfProduct))
            {
                notFound = false;
                System.out.println("Product Found !");
                System.out.println(productManager.products.get(i).toString());
            }
        }if (notFound)
    {
        System.out.println("Product not found !");
    }
    }

    public void show_all_product() {

        boolean Empty = true;
        if (productManager.laptops.size() > 0 || productManager.phones.size() > 0) {
            Empty = false;
            System.out.println("\n---{Digital Products}---");

            if (productManager.phones.size() > 0)
            {
                for (int i = 0; i < productManager.phones.size(); i++) {

                    System.out.println("\n---{Phones}");
                    System.out.println(productManager.phones.get(i).toString());

                }
            }

            if (productManager.laptops.size() > 0)
                System.out.println("\n---{Laptops}");
            for (int i = 0; i < productManager.laptops.size(); i++) {
                System.out.println(productManager.laptops.get(i).toString());
            }
        }
        if (productManager.televisions.size() > 0 || productManager.refrigerators.size() > 0) {

            System.out.println("\n---{Home Appliance}---");

            if (productManager.televisions.size() != 0) {

                System.out.println("\n---{Televisions}");
                for (int i = 0; i < productManager.televisions.size(); i++)
                    System.out.println(productManager.televisions.get(i).info);
            }
            if (productManager.refrigerators.size() != 0)
            {
                System.out.println("\n---{Refrigerators}");
                for (int i = 0; i < productManager.refrigerators.size(); i++)
                    System.out.println(productManager.refrigerators.get(i).info);
            }
            if (productManager.heaters.size() != 0)
            {
                System.out.println("\n---{Heaters}");
                for (int i = 0; i< productManager.heaters.size();i++)
                    System.out.println(productManager.heaters.get(i).info);
            }
        }
        if (productManager.dresses.size() != 0 || productManager.shoes.size() != 0) {
            System.out.println("\n---{Clothes}---");

            if (productManager.dresses.size() != 0)
            {
                System.out.println("\n---{Dresses}");
                for (int i = 0; i< productManager.dresses.size();i++)
                    System.out.println(productManager.dresses.get(i).info);
            }
            if ( productManager.shoes.size() != 0)
            {
                System.out.println("\n---{Shoes}");
                for (int i = 0; i< productManager.shoes.size();i++)
                    System.out.println(productManager.shoes.get(i).info);
            }
        }
        if (productManager.foods.size() != 0) {
            System.out.println("\n---{Foods}---");
            for (int i = 0; i< productManager.foods.size();i++)
                System.out.println(productManager.foods.get(i).info);
        }

        if (Empty) System.out.println("{!} No Product Available");
        System.out.println("\nLogin for shipping\n");
            main_Panel();
    }
}
