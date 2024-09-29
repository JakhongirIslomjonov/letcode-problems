package uz.pdp.leetcode;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println(extracted(4));


    }

    private static int extracted(int n) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
            int num = 1;
            n--;
            if (arr[i] < 100 && arr[i] > 10){
                for (int j = 0; j < n; j++) {
                    num = num * 100;
                }
            }else {
                for (int j = 0; j < n; j++) {
                    num = num * 10;
                }
            }
                number = number + arr[i] * num;
        }
        return number + 1;
    }
}
