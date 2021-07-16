package assignment04;

import java.util.Arrays;

public class StringOfFirstLetter {
    public static void main(String[] args) {

    // StringBuilder used for string mutability but not thread safe
    //
    //


            StringBuilder firstLetter = new StringBuilder();

            Arrays.asList("alphabets", "kangaroo", "huston", "pollution", "sound", "marvelous")
                    .forEach(word -> firstLetter.append(word.charAt(0)));

            System.out.println(firstLetter);


    }


}
