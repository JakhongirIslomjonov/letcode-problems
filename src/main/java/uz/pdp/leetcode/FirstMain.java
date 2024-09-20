package uz.pdp.leetcode;

import java.util.Arrays;

public class FirstMain {
    public static void main(String[] args) {

        System.out.println(subsetXORSum(new int[]{1, 3}));
        System.out.println(numberOfEmployeesWhoMetTarget(new int[]{0, 1, 2, 3, 4}, 2));
        System.out.println(interpret("G()(al)"));
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(new int[]{8, 1, 2, 2, 3})));
        System.out.println(Arrays.toString(runningSum(new int[]{1, 2, 3, 4})));
        System.out.println(removeElement(new int[]{3, 2, 2, 3}, 3));
    }

    public static int removeElement(int[] nums, int val) {
        int i = 0;
        for (int n = 0; n < nums.length; n++) {
            if (nums[n] != val) {
                nums[i] = nums[n];
                i++;
            }
        }

        return i;

    }

    //1863. Sum of All Subset XOR Totals
    public static int subsetXORSum(int[] nums) {
        int xorSum = 0;
        int n = nums.length;
        for (int num : nums) {
            xorSum |= num;
        }
        return xorSum * (1 << (n - 1));
    }

    //2798. Number of Employees Who Met the Target
    public static int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int count = 0;
        for (int hour : hours) {
            if (hour >= target)
                count++;
        }
        return count;
    }

    //1678. Goal Parser Interpretation
    public static String interpret(String command) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < command.length(); i++) {
            if (command.charAt(i) == 'G') {
                str.append('G');
            } else if (command.charAt(i) == '(' && command.charAt(i + 1) == ')') {
                str.append("o");
                i++;
            } else if (command.charAt(i) == '(' && command.charAt(i + 1) == 'a') {
                str.append("al");
                i += 3;
            }
        }
        return str.toString();
    }

    //1365. How Many Numbers Are Smaller Than the Current Number
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int num : nums) {
                if (num < nums[i]) {
                    count++;
                }
            }
            arr[i] = count;
        }
        return arr;
    }

    //1480. Running Sum of 1d Array
    public static int[] runningSum(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            count += nums[i];
            arr[i] = count;
        }
        return arr;
    }
}



