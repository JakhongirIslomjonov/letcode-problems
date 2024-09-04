package uz.pdp;

import java.util.Objects;

public class FiveLesson {
    public static void main(String[] args) {

        System.out.println(returnerStr("abcXY123XYijk", "XY"));

    }

    public static String returnerStr(String string, String word) {
        String newStr = "";
        for (int i = 0; i < string.length()-word.length(); i++) {
            if (Objects.equals(word, string.substring(i,i+ word.length()))) {
                if (i > 0) {
                    newStr +=string.charAt(i-1);
                }
                if (i + word.length() < string.length()) {
                    newStr += string.charAt(i + word.length());
                }
                }
        }

        return newStr;
    }
}
