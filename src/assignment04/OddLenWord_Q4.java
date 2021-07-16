package assignment04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OddLenWord_Q4 {
    public static void main(String[] args) {

        List<String> l = new ArrayList<>();
        l.add("Happy");
        l.add("Four");
        l.add("Friends");
        l.add("Orange");
        l.add("out");

        l.removeIf(n -> (n.length()) % 2 != 0);

            System.out.println(l);

    }
}
