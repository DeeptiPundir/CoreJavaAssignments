package assignment04;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumer_Q3 {
    public static void main(String[] args) {
//        Consumer<Integer> consumer = t -> System.out.println("Printing :" + t);
//        consumer.accept(20);


        List<Integer> l1 = Arrays.asList(1,2,4,7,3,9,5);
//        l1.stream().forEach(consumer);
        l1.stream().forEach(t -> System.out.println("Printing :" + t));
    }
}
