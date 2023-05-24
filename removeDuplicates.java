// leetcode question: 26: removing duplicates from array element.

public class removeDuplicates {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 4, 5, 6, 6};
        int l = removeDuplicates(nums);
        for (int i = 1; i < l; ++i) {
            System.out.println(i);
        }
    }

    public static int removeDuplicates(int[] nums) {
        int i = 0;
        // i - 1 checks the next neighboring element
        for (int num : nums) {
            if (i < 1 || num > nums[i - 1]) {
                nums[i++] = num;
            }
        }
        return i;
    }
}
