package admin;

import costumer.Costumer;
import costumer.CostumerManager;
import product.Phone;
import product.ProductManager;
import seller.Seller;
import seller.SellerManager;

import java.util.Scanner;

import static java.lang.System.out;

public class AdminPanel {


    AdminManager adminManager = new AdminManager();
    CostumerManager costumerManager = new CostumerManager();
    ProductManager productManager = new ProductManager();
    SellerManager sellerManager = new SellerManager();
    
    Scanner scanner = new Scanner(System.in);

    public void admin_Panel()
    {
        out.println("Choose : (1-5)\n\n1.---{Edit personal info}" +
                "\n2.---{Show Users}\n3.---{requests}\n4.---{Admin info}\n5.---{Main Menu}");
        int choice = scanner.nextInt();
        switch (choice)
        {
            case 1 : edit_info();break;
            case 2 : show_users();break;
            case 3 : seller_requests_menu();break;
            case 4 :
                out.println("---{Personal Info}---");
                out.println(adminManager.admin.toString());
                out.println("--------------------");
                admin_Panel();break;
            case 5 :break;
            default: out.println("{!} Unexpected value : "
                    + choice); admin_Panel(); break;
        }
    }
    public void edit_info()
    {
        out.println("{firstname} : ");
        String firstname = scanner.next();
        out.println("{lastname}: ");
        String lastname = scanner.next();
        out.println("{phone number} : ");
        long phoneNumber = scanner.nextLong();
        out.println("{email}: ");
        String email = scanner.next();
        adminManager.editInfo(firstname,lastname,email,phoneNumber);
        out.println("{!} Updated successfully . . . ");
        admin_Panel();
    }

    public void show_users()
    {
        out.println("Show : \n\n1.---{Costumers}\n2.---{Sellers}");
        int choice = scanner.nextInt();
        switch (choice)
        {
            case 1 : show_All_costumers();break;
            case 2 : show_All_sellers();break;
            default: out.println("{!} Unexpected value: " + choice);show_users();
        }
        admin_Panel();
    }

    public void show_All_sellers()
    {
        for (Seller seller : sellerManager.sellers)
        {
            out.println(seller.toString());
            out.println("---------------------------------");
        }
        out.println("Sellers List ended ... ");
    }

    public void show_All_costumers()
    {
        for (Costumer costumer : costumerManager.costumers)
        {
            out.println(costumer.toString);
            out.println("---------------------------------");
        }
        out.println("{!} Costumers List ended ... ");
    }

    public void seller_requests_menu()
    {
        out.println("Show Requests of :\n\n1.---{Add seller}\n2.---{Add product}\n3.---{Admin menu}");
        int choice = scanner.nextInt();
        switch (choice)
        {
            case 1: accept_seller();break;
            case 2: accept_add_product();break;
            case 3: break;
        }
        admin_Panel();
    }

    public void accept_add_product()
    {
        for (int i = 0 ; i < productManager.phones_requests.size();i++)
        {
            out.println(productManager.phones_requests.get(i).toString());
            out.println("1.---{add Product}\n2.---{reject Product}\n3.---{ignore}");
            int choice = scanner.nextInt();
            switch (choice)
            {
                case 1: productManager.phones.add(productManager.phones_requests.get(i));
                case 2: productManager.phones_requests.remove(productManager.phones_requests.get(i));break;
                case 3: continue;
            }
        }
        for (int i = 0 ; i < productManager.laptops_requests.size();i++)
        {
            out.println(productManager.laptops_requests.get(i).toString());
            out.println("1.---{add product.Product}\n2.---{reject Product}\n3.---{ignore}");
            int choice = scanner.nextInt();
            switch (choice)
            {
                case 1: productManager.laptops.add(productManager.laptops_requests.get(i));
                case 2: productManager.laptops_requests.remove(productManager.laptops_requests.get(i));break;
                case 3: continue;
            }
        }
        out.println("{!} Product list ended ...");
        admin_Panel();
    }

    public void accept_seller()
    {
        for (int i = 0; i < sellerManager.requests.size(); i++)
        {
            out.println(sellerManager.requests.get(i).toString());

            out.println("1.---{add seller}\n2.---{reject seller}\n3.---{ignore}");
            int choice = scanner.nextInt();
            switch (choice)
            {
                case 1 :
                    sellerManager.sellers.add(sellerManager.requests.get(i));
                case 2:
                    sellerManager.requests.remove(sellerManager.requests.get(i));break;
                case 3: continue;

                default: out.println("{!} Unexpected value: " + choice);
            }
        }
        out.println("{!} list ended . returning to admin menu . . .");

    }

}
