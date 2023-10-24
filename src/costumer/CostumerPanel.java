package costumer;

import product.*;
import comment.Comments;

import javax.xml.stream.events.Comment;
import java.util.Scanner;

public class CostumerPanel {
    static Scanner scanner = new Scanner(System.in);

    public static void costumer_Panel(String username)
    {
        for (int i = 0; i < CostumerManager.costumers.size(); i++) {
            if (CostumerManager.costumers.get(i).getUserName().equals(username))
                CostumerManager.costumers.get(i).setSigned(true);
        }
                System.out.println("Choose : (1-6)" +
                        "\n1.---{Edit info} \n2.---{Show & Choose Products}\n3.---{Show info}" +
                        "\n4.---{Complete Shipping}\n5." +
                        "---{Increase Credit}\n6.---{Add comment on a Product} " +
                        "\n7.---{add Rating to a product}\n8.---{main menu}");
                int choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        edit_costumer_Menu(username);
                        break;
                    case 2:
                        add_to_basket_Panel(username);
                        break;
                    case 3:
                        System.out.println(CostumerManager.showInfo(username));
                        costumer_Panel(username);
                        break;
                    case 4:
                        complete_shipping(username);
                        break;
                    case 5:
                        increase_credit(username);
                        break;
                    case 6:
                        add_comment(username);
                        costumer_Panel(username);
                        break;
                    case 7:
                        add_rating(username);
                        break;
                    case 8:

                        for (int i = 0; i < CostumerManager.costumers.size(); i++) {
                            if (CostumerManager.costumers.get(i).getUserName().equals(username))
                                CostumerManager.costumers.get(i).setSigned(false);
                        }
                        System.out.println("{...} Returning");
                        break;
                    default:
                        System.out.println("{!} Unexpected value: " + choice);
                        costumer_Panel(username);
                }
            }
    public static void add_comment(String username)
    {
        for(int i = 0; i< CostumerManager.costumers.size(); i++)
             {
                 if(CostumerManager.costumers.get(i).getUserName().equals(username))
                 {
                     System.out.println("{!} Products you can comment on are : ");
                     for (int j = 0; j< CostumerManager.costumers.get(i).phones_basket.size(); j++)
                     {
                         System.out.println(CostumerManager.costumers.get(i).toString);
                         System.out.println("1.---{Comments}");
                         System.out.println("2.---{Skip}");
                         int choice = scanner.nextInt();
                         switch (choice)
                         {
                             case 1:
                                 System.out.println("{!} Enter comment");
                                 String comment = scanner.next();
                                 ProductManager.phones.get(i).comments.add((Comment) new Comments(username,
                                         CostumerManager.costumers.get(i).phones_basket.get(j).getName(),comment));
                         }
                     }
                 }
             }
    }

    public static void increase_credit(String username)
    {
        for (int i = 0; i< CostumerManager.costumers.size(); i++)
        {
            if(CostumerManager.costumers.get(i).getUserName().equals(username)) {

                System.out.println("increase by ?$ :");
                long amount = scanner.nextLong();
                long final_amount = CostumerManager.costumers.get(i).getCredit() + amount;
                CostumerManager.costumers.get(i).setCredit(final_amount);

                System.out.println("Your credit Updated ... to : " +
                        CostumerManager.costumers.get(i).getCredit()+" $");
            }
        }
        costumer_Panel(username);
    }

    public static void add_to_basket_Panel(String username)
    {
        for (int i = 0; i< CostumerManager.costumers.size(); i++)
        {
            if(CostumerManager.costumers.get(i).getUserName().equals(username))
            {
                System.out.println("Choose category :(1-8)" +
                        "\n1.Mobile Phones\n2.Laptops\n3.Televisions\n4.Refrigerators"+
                        "\n5.Dresses \n6.Shoes \n7.Heaters \n8.Foods");
                int choice = scanner.nextInt();
                switch (choice)
                {
                    case 1:

                        for (Phone phone : ProductManager.phones)
                        {
                            System.out.println(phone.info);
                            System.out.println("1.buy...2.ignore");
                            int choice01 = scanner.nextInt();
                            switch (choice01)
                            {
                                case 1: CostumerManager.costumers.get(i).phones_basket.add(phone);
                                case 2:
                            }

                        }
                    break;
                    case 2:
                        for (Laptop laptop : ProductManager.laptops)
                        {
                            System.out.println("1.buy...2.ignore");
                            int choice01 = scanner.nextInt();
                            switch (choice01)
                            {
                                case 1: CostumerManager.costumers.get(i).laptops_basket.add(laptop);
                                case 2:
                            }
                        }
                    break;
                    case 3:
                        for (Television television : ProductManager.televisions)
                        {
                            System.out.println("1.buy...2.ignore");
                            int choice01 = scanner.nextInt();
                            switch (choice01)
                            {
                                case 1: CostumerManager.costumers.get(i).televisions_basket.add(television);
                                case 2:
                            }
                        }
                        break;
                    case 4:
                        for (Refrigerator refrigerator : ProductManager.refrigerators)
                        {
                            System.out.println("1.buy...2.ignore");
                            int choice01 = scanner.nextInt();
                            switch (choice01)
                            {
                                case 1: CostumerManager.costumers.get(i).refrigerators_basket.add(refrigerator);
                                case 2:
                            }
                        }
                        break;
                    case 5:
                        for (Dress dress: ProductManager.dresses)
                        {
                            System.out.println("1.buy...2.ignore");
                            int choice01 = scanner.nextInt();
                            switch (choice01)
                            {
                                case 1: CostumerManager.costumers.get(i).dresses_basket.add(dress);
                                case 2:
                            }
                        }
                        break;
                    case 6:
                        for (Shoes shoes: ProductManager.shoes)
                        {
                            System.out.println("1.buy...2.ignore");
                            int choice01 = scanner.nextInt();
                            switch (choice01)
                            {
                                case 1: CostumerManager.costumers.get(i).shoes_basket.add(shoes);
                                case 2:
                            }
                        }
                        break;
                    case 7:
                        for (Heater heater: ProductManager.heaters)
                        {
                            System.out.println("1.buy...2.ignore");
                            int choice01 = scanner.nextInt();
                            switch (choice01)
                            {
                                case 1: CostumerManager.costumers.get(i).heaters_basket.add(heater);
                                case 2:
                            }

                        }
                    break;
                    case 8:
                        for (Food food : ProductManager.foods)
                        {
                            System.out.println("1.buy...2.ignore");
                            int choice01 = scanner.nextInt();
                            switch (choice01)
                            {
                                case 1: CostumerManager.costumers.get(i).foods_basket.add(food);
                                case 2:
                            }

                        }
                        break;

                    default: System.out.println("Unexpected value: " + choice);
                }
            }
        }
        costumer_Panel(username);
    }

    public static void complete_shipping(String username)
    {
        long final_price = 0;
        for (int i = 0; i< CostumerManager.costumers.size(); i++)
        {
            if (CostumerManager.costumers.get(i).getUserName().equals(username))
            {
                System.out.println("Factor------------------------- ");

                for (int j = 0; j < CostumerManager.costumers.get(i).phones_basket.size(); j++)
                {
                    System.out.println(CostumerManager.costumers.get(i).phones_basket.get(j).info);
                    System.out.println("-----------------------------");
                    final_price += CostumerManager.costumers.get(i).phones_basket.get(j).getPrice();
                }

                for (int j = 0; j < CostumerManager.costumers.get(i).laptops_basket.size(); j++)
                {
                    System.out.println(CostumerManager.costumers.get(i).laptops_basket.get(j).info);
                    System.out.println("-----------------------------");
                    final_price += CostumerManager.costumers.get(i).laptops_basket.get(j).getPrice();
                }

                for (int j = 0; j < CostumerManager.costumers.get(i).televisions_basket.size(); j++)
                {
                    System.out.println(CostumerManager.costumers.get(i).televisions_basket.get(j).info);
                    System.out.println("-----------------------------");
                    final_price += CostumerManager.costumers.get(i).televisions_basket.get(j).getPrice();
                }

                System.out.println("Total price : " + final_price);
                System.out.println("Your current credit is : "+ CostumerManager.costumers.get(i).getCredit());
                if (CostumerManager.costumers.get(i).getCredit() >= final_price)
                {
                    System.out.println("1.Pay\n2.Cancel");
                    int choice = scanner.nextInt();
                    switch (choice)
                    {
                        case 1 :
                        {
                            long credit = CostumerManager.costumers.get(i).getCredit() - final_price;
                            CostumerManager.costumers.get(i).setCredit(credit);
                            for (int j = 0; j< CostumerManager.costumers.get(i).phones_basket.size(); j++)
                            {
                                CostumerManager.costumers.get(i).bought.add(CostumerManager.costumers.get(i).phones_basket.get(j));
                                CostumerManager.costumers.get(i).phones_basket.remove(CostumerManager.costumers.get(i).phones_basket.get(j));

                            }
                            for (int j = 0; j< CostumerManager.costumers.get(i).laptops_basket.size(); j++)
                            {
                                CostumerManager.costumers.get(i).bought.add(CostumerManager.costumers.get(i).laptops_basket.get(j));
                                CostumerManager.costumers.get(i).laptops_basket.remove(CostumerManager.costumers.get(i).laptops_basket.get(j));
                            }
                            for (int j = 0; j< CostumerManager.costumers.get(i).televisions_basket.size(); j++)
                            {
                                CostumerManager.costumers.get(i).bought.add(CostumerManager.costumers.get(i).televisions_basket.get(j));
                                CostumerManager.costumers.get(i).televisions_basket.remove(CostumerManager.costumers.get(i).televisions_basket.get(j));
                            }


                            System.out.println("Products bought successfully ...");
                        }break;
                        case 2 : break;
                    }
                }else {
                    System.out.println("Not enough credit ...");
                }
            }
        }
        costumer_Panel(username);
    }

    static void edit_costumer_Menu(String old_username)
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
        System.out.println("ENTER NEW PASSWORD : ");
        String newPassword = scanner.next();

        CostumerManager.editInfo(old_username,username,firstname,lastname,newEmail
                ,newPassword,newPhoneN);
        System.out.println("UPDATED SUCCESSFULLY . . .");
        costumer_Panel(username);
    }
    public static void add_rating(String username)
    {
        for (int i = 0; i< CostumerManager.costumers.size(); i++)
        {
            if (CostumerManager.costumers.get(i).getUserName().equals(username))
            {
                System.out.println("Products You can rate by 10 : ");

                for (Product product : CostumerManager.costumers.get(i).bought)
                {
                    System.out.println(product.info);
                    System.out.println("Enter score : ");
                    double score = scanner.nextDouble();
                    product.setScore(score);
                }
            }
        }
        System.out.println("Returning to the menu ...");
        costumer_Panel(username);
    }

}
