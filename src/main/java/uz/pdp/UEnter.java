package uz.pdp;

import java.util.Random;
import java.util.Scanner;

public class UEnter {
    public static void main(String[] args) {
        //1-
       /* System.out.println("+________________________________+");
        System.out.println("|Name   : Jakhongir Islomjonov    |");
        System.out.println("|Email  : jahongirnamti@gmamil.com|");
        System.out.println("|Address: Tashkent , Uzbekistan  |");
        System.out.println("+--------------------------------+");
*/
//2-
      /*  Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name = scanner.next();
        System.out.println("Hello "+name+" !");
*/

        //3-
       /* Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter rectangle width :");
        int width = scanner.nextInt();
        System.out.print("Please enter rectangle height :");
        int height = scanner.nextInt();
        System.out.println("Area : width * height = " + (width * height));
        System.out.println("Perimeter: 2 * ( width + height ) = " + (2 * (width + height)));
*/

        //4-

        /*Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius  of a cylinder: ");
        double radius = scanner.nextDouble();
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Enter the length of a cylinder: ");
        double length = scanner1.nextDouble();
        double area = Math.pow(radius, 2) * Math.PI;
        System.out.println("The area is area = radius * radius * Pi =" + area);
        System.out.println("The volume is volume = area * length = " + (area * length));
*/

        //5-
      /*  Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length of the sides of the Equilateral triangle:");
        int side = scanner.nextInt();
        System.out.print("Enter length of the height of the Equilateral triangle:");
        int height = scanner.nextInt();
        double area = (Math.pow(3, 0.5) / 4) * Math.pow(side, 2);
        System.out.println("The area is area =\n" +
                "√\n" +
                "3\n" +
                "4\n" +
                "∗ side2\n = " + area);
        System.out.println("The volume of the Triangular prism is volume = area * length = " + area *height);
*/
//        lottery();

//        extracted();

        Scanner scanner = new Scanner(System.in);
        System.out.print("enter channel number :");
        int channelNumber = scanner.nextInt();
        if (channelNumber >= 1 && channelNumber <= 120) {
            System.out.println("channel number -> " + channelNumber);
        } else if (channelNumber < 1) {
            channelNumber = -channelNumber % 120;
            System.out.println("channel number -> " + channelNumber);
        } else {
            channelNumber = channelNumber % 120;
            System.out.println("channel number -> " + channelNumber);
        }

    }

    private static void extracted() {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[3];
        for (int i = 0; i < 3; i++) {
            arr[i] = scanner.nextInt();
            if ((i > 0) && (arr[i - 1] == 2)) {
                arr[i] = 0;
            }
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    private static void lottery() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int temp = 0;
        int matches = 0;

        int[] loterryNumbers = new int[6];
        int[] userNumbers = new int[6];

        for (int i = 0; i < 6; i++) {
            loterryNumbers[i] = random.nextInt(1, 37);
        }
        System.out.println("To win a prize, you need to enter 6 numbers between 1 and 36 (including 36)");
        System.out.println("Enter the numbers one by one:");
        for (int i = 0; i < userNumbers.length; i++) {
            temp = scanner.nextInt();
            if (temp >= 1 && temp <= 36) {
                userNumbers[i] = temp;
                if (loterryNumbers[i] == userNumbers[i]) {
                    matches++;
                }
            } else {
                System.out.println("Invalid Number please try enter number ");
                i--;
            }

        }
        if (matches == 6) {
            System.out.println("10000$");
        } else if (matches == 5) {
            System.out.println("5000$");
        } else if (matches >= 3) {
            System.out.println("3000$");
        } else {
            System.out.println("fail because your  find number : " + matches);
        }
        System.out.print("random number :");
        for (int arr : loterryNumbers) {
            System.out.print(arr + " ");
        }
        System.out.println();
        System.out.print("user enter number : ");
        for (int arr : userNumbers) {
            System.out.print(arr + " ");
        }
    }
}
