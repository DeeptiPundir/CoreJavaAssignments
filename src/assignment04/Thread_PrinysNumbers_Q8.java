package assignment04;

import java.util.Arrays;

public class Thread_PrinysNumbers_Q8 {

    public static void main(String[] args) {

        new Thread(() -> Arrays.asList(11, 12, 13, 14, 15, 16, 17, 18, 19, 20)
                .forEach(System.out::print)).start();

// for each takes in a consumer -- as it needs to consume each instance that loop is gonna go through
    }
}
