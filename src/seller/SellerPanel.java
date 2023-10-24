package seller;

import product.ProductManager;

import java.util.Scanner;

public class SellerPanel {

    ProductManager productManager = new ProductManager();
    SellerManager sellerManager = new SellerManager();
    Scanner scanner = new Scanner(System.in);

    public void seller_Panel(String username)
    {
        System.out.println("1.edit info \n2.show sold logs\n3.show info\n4.add product\n" +
                "5.edit product\n6.main menu");
        int choice = scanner.nextInt();
        switch (choice)
        {
            case 1: edit_seller_menu(username); break;
            case 3: System.out.println(sellerManager.showInfo(username));seller_Panel(username);break;
            case 4: request_add_product(username);break;
            case 6: break;
            default: System.out.println("Unexpected value: " + choice); seller_Panel(username);
        }
    }

    public void edit_seller_menu(String old_username)
    {
        System.out.println("username");
        String username = scanner.next();
        System.out.println("firstname");
        String firstname = scanner.next();
        System.out.println("lastname");
        String lastname = scanner.next();
        System.out.println("ENTER NEW EMAIL : ");
        String newEmail = scanner.next();
        System.out.println("ENTER NEW PHONE-NUMBER : ");
        long newPhoneN = scanner.nextLong();
        System.out.println("Enter company name : ");
        String company_name = scanner.next();
        System.out.println("ENTER NEW PASSWORD : ");
        String newPassword = scanner.next();

        sellerManager.editInfo(old_username,username,firstname,lastname,newEmail
                ,newPassword,newPhoneN,company_name);
        System.out.println("UPDATED SUCCESSFULLY . . .");
        seller_Panel(username);
    }

    public void request_add_product(String seller)
    {
        System.out.println("name : ");
        String name = scanner.next();
        System.out.println("Description : ");
        String description = scanner.next();
        System.out.println("Price : ");
        long price = scanner.nextLong();
        System.out.println("Choose Category :" +
                "\n1.Phones\n2.Laptops\n3.Dresses\n4.product.Shoes\n5.Televisions" +
                "\n6.Refrigerators\n7.Heaters\n8.Foods");
        int choice = scanner.nextInt();
        switch (choice)
        {
            case 1 : {
                System.out.println("System : ");
                String system = scanner.next();
                System.out.println("ram : ");
                int ram = scanner.nextInt();
                System.out.println("Storage : ");
                int storage = scanner.nextInt();
                System.out.println("Area : ");
                int area = scanner.nextInt();
                System.out.println("Weight : ");
                int weight = scanner.nextInt();
                System.out.println("sim-cards : ");
                int simCards = scanner.nextInt();
                System.out.println("Camera : ");
                int camera = scanner.nextInt();

                productManager.add_phone(name, seller, description,price, system, ram, storage, area, weight, simCards, camera);
                System.out.println("Requested successfully . . . ");

            }break;
            case 2:
            {
                System.out.println("Processor : ");
                String processor = scanner.next();
                System.out.println("Ram :");
                int ram = scanner.nextInt();
                System.out.println("System : ");
                String system = scanner.next();
                System.out.println("Storage : ");
                int storage = scanner.nextInt();
                System.out.println("Area : ");
                int area = scanner.nextInt();
                System.out.println("Weight : ");
                int weight = scanner.nextInt();
                System.out.println("Is gaming : (1.yes - 2.no) ");
                int isGaming = scanner.nextInt();
                boolean answer = gaming(isGaming);

                productManager.add_laptop(name,seller,description,price,processor,ram,storage,area
                ,weight,processor,answer);
            }break;
            case 3:
        }
        seller_Panel(seller);
    }

    public boolean gaming(int isGaming)
    {
        if (isGaming == 1)
            return true;
        else
            return false;
    }
}
