package assignment04;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Supplier_Q3{


    public static void main(String[] args) {

        Supplier<String > s = () -> "Hello";
//        System.out.println(s.get());


        List<String> l3 = Arrays.asList("one","two","three","four","five");
        System.out.println(l3.stream().findAny().orElseGet(s));


    }
}
