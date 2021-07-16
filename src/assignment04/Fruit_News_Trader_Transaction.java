package assignment04;

import java.sql.Array;
import java.util.*;
import java.util.function.Consumer;

//import static sun.jvm.hotspot.runtime.PerfMemory.start;

public class Fruit_News_Trader_Transaction {
    public static void main(String[] args) {

        Fruit f1 = new Fruit("apple",120,100,"red");
        Fruit f2 = new Fruit("orange",60,60,"red");
        Fruit f3 = new Fruit("cherry",68,40,"red");
        Fruit f4 = new Fruit("banana",80,30,"red");

        List<Fruit> fruit = Arrays.asList(f1,f2,f3,f4);



//        fruit.stream().filter(fruit1 -> fruit1.getCalories() < 100)
//                .sorted((F1,F2) -> F1.getCalories() - F2.getCalories()).forEach(System.out::print);

//        System.out.println("Color wise list-----------------------------------------------------------------------");
//        fruit.stream()
//                .sorted((F1,F2) -> F1.getColor().compareTo(F2.getColor())).forEach(System.out::print);


        System.out.println("Red color fruits sorted as per price --------------------------------------------------------");
        fruit.stream()
                .sorted((F1,F2) -> {
                    if(F1.getColor()== F2.getColor())
                    {
                        if(F1.getPrice()> F2.getPrice())
                            return -1;
                        else if(F1.getPrice()< F2.getPrice())
                            return -1;
                    }
                    else
                        return 0;
                    return 1;
                }).forEach(System.out::print);


// -----------------------------------------------------------------------------------------------------------------------------------------------


































//        fruit.entrySet()
//                .stream()
//                .sorted(Map.Entry.<String , Integer>comparingByValue().reversed())
//                .forEach(f -> {
//                   if( f.getValue() < 100)
//                       System.out.println(f.getKey());
//                });

    }
}
