package uz.pdp.uenter.sort;

import java.util.Scanner;

public class Sorting {
    public static void main(String[] args) {
        // bitta for
        //while
        Scanner scanner = new Scanner(System.in);
        System.out.println(" newchta son kiritasiz :");
        int number = scanner.nextInt();
        int[] arr = new int[number];
        int[] arrResult = new int[number];

        System.out.println("Sonlarni birnma ketinlikda kiriting ");
        for (int i = 0; i < args.length; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[i] > key) {
                arr[j + 1] = arr[i];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
}
