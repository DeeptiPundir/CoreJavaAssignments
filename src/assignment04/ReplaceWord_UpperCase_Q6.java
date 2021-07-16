package assignment04;

import java.util.Arrays;
import java.util.List;

public class ReplaceWord_UpperCase_Q6 {

    public static void main(String[] args) {

        List<String> l = Arrays.asList("apple" ," neon", "particular","friends");
        l.replaceAll(String::toUpperCase);
        System.out.println(l);


//        Replace only first letter to upper case

        System.out.println("Print the strings with First letter upper case -----------------------------------------------");
        StringBuilder l1 = new StringBuilder();
        List<String> L1 = Arrays.asList("apple" ," neon", "particular","friends");
        for (String s: L1 )
        {
            char[] stringArray = s.trim().toCharArray();
            stringArray[0]=Character.toUpperCase(stringArray[0]);
            s = new String(stringArray);
            l1.append(s).append(" , ");

        }

        System.out.println("Result string: " + l1.toString().trim());
    }
}
