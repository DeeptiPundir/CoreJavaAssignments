package assignment04;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Predicate_Q3{



    public static void main(String[] args) {

//       Predicate<Integer> pre =  t -> {
//            if (t % 2 == 0)
//                return true;
//            else
//                return false;
//        OR
        Predicate<Integer> pre = t -> t%2==0;
        System.out.println(pre.test(9));


        List<Integer> l2 = Arrays.asList(20,34,65,12,98,47);
        l2.stream().filter(t->t%2==0).forEach(System.out::println);

    }
}
