public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 5};
        System.out.println(searchInsert(nums, 5));
    }

    public static int searchInsert(int[] nums, int target) {
        int count = 0;
        if (nums[nums.length - 1] < target) {
            return nums.length;
        }
        if (nums[0] > target) {
            return 0;
        }
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] == target) {
                return i;
            } else if (nums[i] > target) {
                ++count;
                if (count > 0) {
                    return i;
                }
            }
        }
        return count;
    }
}
