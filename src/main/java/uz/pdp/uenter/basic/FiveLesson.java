package uz.pdp.uenter.basic;

import java.util.Objects;

public class FiveLesson {
    public static void main(String[] args) {

//        System.out.println(returnerStr("abcXY123XYijk", "XY"));


    }

    public static void bubbleSort(int[] arr, int n) {
        int temp;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[i] + 1) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static String returnerStr(String string, String word) {
        String newStr = "";
        for (int i = 0; i < string.length() - word.length(); i++) {
            if (Objects.equals(word, string.substring(i, i + word.length()))) {
                if (i > 0) {
                    newStr += string.charAt(i - 1);
                }
                if (i + word.length() < string.length()) {
                    newStr += string.charAt(i + word.length());
                }
            }
        }

        return newStr;
    }
}
