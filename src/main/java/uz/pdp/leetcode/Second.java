package uz.pdp.leetcode;

import javax.swing.tree.TreeNode;

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

    public static int rangeSumBST(TreeNode root, int low, int high) {
        if (root == null) return 0;
        int sum = 0;
        sum += (root.val >= low && root.val <= high) ? root.val : 0;
        rangeSumBST(root.left, low, high);
        rangeSumBST(root.right, low,high);
    }
    int rangeSumBST(TreeNode  root, int low, int hight){
      e
    }
}
