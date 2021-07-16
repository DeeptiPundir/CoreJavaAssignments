package assignment04;

import java.util.Map;
import java.util.TreeMap;

public class KeyValuePair_toString_Q7 {
    public static void main(String[] args) {

        Map<String , Integer> mp = new TreeMap<>();
        mp.put("First" ,100);
        mp.put("Second" ,200);
        mp.put("Third" ,300);
        mp.put("Fourth" ,400);

        StringBuilder sb = new StringBuilder();
        mp.entrySet().forEach(s -> sb.append(s.getKey()).append(s.getValue()).append(" , "));

        System.out.println(sb.toString());

    }
}
