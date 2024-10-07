package uz.pdp.leetcode;

public class Second {
    public static void main(String[] args) {
        System.out.println(searchInsert(new int[]{1, 2, 3, 4, 5, 6}, 2));
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
            else left =mid +1;
        }
        return -1;
    }
}
