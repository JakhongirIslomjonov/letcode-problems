package uz.pdp.liblary;

import java.util.Scanner;

public interface Input {
    static int inputInt(String msg) {
        System.out.println();
        System.out.println(msg);
        return new Scanner(System.in).nextInt();
    }

    static String inputStr(String msg) {
        System.out.println();
        System.out.println(msg);
        return new Scanner(System.in).nextLine();
    }
}
