package assignment04;

import java.util.Scanner;

interface PrintsOrders {
    int PrintPrice(String item ,int quantity);
}

abstract class Items{
    abstract int getcost(int quantity);
}

class Candy extends Items{
    @Override
    int getcost(int quantity) {
        return quantity*100;
    }
}

class Cookie extends Items{
    @Override
    int getcost(int quantity) {
        return quantity*150;
    }
}



public class PrintOrders_Q2 {

    public static void main(String[] args) {
        int CandyCost = 0;
        int CookieCost = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("To place your order enter quantity of item : ");
        String item = sc.next();
        int Quantity = sc.nextInt();


        if(item.equals("candy"))
        {
            Candy c = new Candy();
            CandyCost = c.getcost(Quantity);
            System.out.println("Total cost of candy purchased is : " + CandyCost);
        }
        else if(item.equals("cookie"))
        {
            Cookie coo = new Cookie();
            CookieCost = coo.getcost(Quantity);
            System.out.println("Total cost of cookie purchased is : " + CookieCost);
        }





        PrintsOrders p = new PrintsOrders() {
            @Override
            public int PrintPrice(String item, int quantity) {
                return 0;
            }
        };
//        p.PrintPrice("Total amount is: ", "\n Accepted or Completed");

    }
}



