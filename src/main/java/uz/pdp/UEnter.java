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
        lottery();


    }

    private static void lottery() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int arrNum;
        int numberCount = 0;
        int[] arrRandomNumber = new int[6];
        int[] arrUserEnterNumber = new int[6];
        for (int i = 0; i < 6; i++) {
            arrRandomNumber[i] = random.nextInt(1, 37);
        }
        System.out.print("random number :");
        for (int arr : arrRandomNumber) {
            System.out.print(arr + " ");
        }
        System.out.println("To win a prize, you need to enter 6 numbers between 1 and 36 (including 36)");
        System.out.println("Enter the numbers one by one:");
        for (int i = 0; i < arrUserEnterNumber.length; i++) {
            arrNum = scanner.nextInt();
            if (arrNum >= 1 && arrNum <= 36) {
                arrUserEnterNumber[i] = arrNum;
            } else {
                System.out.println("Invalid Number please try enter number ");
                i--;
            }
            if (arrRandomNumber[i] == arrUserEnterNumber[i]) {
                numberCount++;
            }
        }
        if (numberCount == 6) {
            System.out.println("10000$");
        } else if (numberCount == 5) {
            System.out.println("5000$");
        } else if (numberCount == 3) {
            System.out.println("3000$");
        } else {
            System.out.println("fail becouse your  find number : " + numberCount);
        }
        System.out.print("random number :");
        for (int arr : arrRandomNumber) {
            System.out.print(arr + " ");
        }
        System.out.println();
        System.out.print("random number : ");
        for (int arr : arrUserEnterNumber) {
            System.out.print(arr + " ");
        }
    }
}
