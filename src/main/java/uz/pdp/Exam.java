package uz.pdp;

import java.util.Calendar;
import java.util.Scanner;

public class Exam {

    public static void main(String[] args) {
        /*  checkMinusNumber();*/

        /* searchCharacterCount();*/
        /*  isUpperAndLoverCaseCheck();*/

        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        int smInt = 0;
        int smIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
            if (i > 0 && arr[i] < smInt) {
                smIndex = i;
            } else smInt = arr[i];

        }
        System.out.println(" berilgan arr ichidagi eng kichik index" + smIndex);
    }

    private static void isUpperAndLoverCaseCheck() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Assalomu alaykum kiritmoqchi bo'lgan Satringizni kiriting .... ");
        String str = scanner.next();

        int sumBig = 0;
        int sumSm = 0;
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt)) {
                sumBig++;
            }
            if (Character.isLowerCase(charAt)) {
                sumSm++;
            }
        }
        System.out.println("katta harflar soni : " + sumBig);
        System.out.println("kichik harflar soni : " + sumSm);
    }

    private static void searchCharacterCount() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Assalomu alaykum kiritmoqchi bo'lgan Satringizni kiriting .... ");
        String str = scanner.next();
        System.out.print(" Satringizdagi qidimochi bolgan belgini kiriting .... ");
        String searchChar = scanner.next();
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == searchChar.charAt(0)) {
                sum++;
            }
        }
        System.out.println(sum);
    }

    private static void checkMinusNumber() {
        Scanner scanner = new Scanner(System.in);
        Integer sum = 0;
        Integer num = 0;
        while (num != -1) {
            System.out.print("Son  kiriting ");
            int newNum = scanner.nextInt();
            sum += newNum;
            num = newNum;
        }
        System.out.println(sum);
    }
}
