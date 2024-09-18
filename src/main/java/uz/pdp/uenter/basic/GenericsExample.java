package uz.pdp.uenter.basic;

import java.util.ArrayList;

public class GenericsExample {
    public static void main(String[] args) {


    }

    public static ArrayList<String> split(String s, String regex) {
        ArrayList<String> result = new ArrayList<>();


        for (int i = 0; i < s.length(); i++) {
            if (s.substring(i, regex.length()).equals(regex)) {

            }
        }
        return result  ;
    }

}
