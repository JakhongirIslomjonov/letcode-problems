package uz.pdp.uenter.excep;

import java.util.Random;

public class BoundException {

    public int newArr(int number) throws ArrayIndexOutOfBoundsException {
        Random random = new Random();
        int[] arr = new int[100];
        if (number < arr.length) {
            arr[number] = 12;
        } else throw new ArrayIndexOutOfBoundsException("array index out of bounds exception by jaxongir");
        return arr[number];
    }

    public static void main(String[] args) {
        BoundException boundException = new BoundException();

        try {
            int arr = boundException.newArr(1222);
            System.out.println(arr);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }

    }
}
