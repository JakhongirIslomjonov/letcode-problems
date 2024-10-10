package uz.pdp.leetcode;

import javax.swing.tree.TreeNode;
import java.util.Arrays;

public class Second {
    public static void main(String[] args) {
        /* System.out.println(searchInsert(new int[]{1, 2, 3, 4, 5, 6}, 2));
         */
//        System.out.println(findMaxConsecutiveOnes(new int[]{1, 1, 0, 1, 1, 1}));
        System.out.println(Arrays.toString(sortedSquares(new int[]{-7, -3, 2, 3, 11})));
        // System.out.println(findNumbers(new int[]{555, 901, 482, 1771}));
    }

    public static int[] sortedSquares(int[] nums) {
        int k = nums.length - 1;
        int[] arr = new int[nums.length];
        for (int i = 0, j = nums.length - 1; i <= j; ) {
            if ((nums[i] * nums[i]) < (nums[j] * nums[j])) {
                arr[k--] = nums[j] * nums[j];
                j--;
            } else {
                arr[k--] = nums[i] * nums[i];
                i++;
            }
        }
        return arr;
    }

    public static int findNumbers(int[] nums) {

        int sum = 0;
        for (int num : nums) {
            int count = 0;
            while (num != 0) {
                num = num / 10;
                count++;
            }
            if (count % 2 == 0) {
                sum++;
            }
        }
        return sum;
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int counter = 0;
        for (int num : nums) {
            if (num == 1) counter++;
            else
                counter = 0;
            if (max < counter) max = counter;

        }

        return max;
    }

    public static int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) return mid;
            if (nums[mid] > target) right = mid - 1;
            else left = mid + 1;

        }
        return left;
    }

    public static int searchInsertTwo(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) return mid;
            if (nums[mid] > target) right = mid - 1;
            else left = mid + 1;
        }
        return -1;
    }

    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (isBadVersion(mid)) {
                right = mid;

            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    private boolean isBadVersion(int mid) {
        return false;
    }


}
