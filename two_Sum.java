import java.util.Arrays;

public class two_Sum {
    public static void main(String[] args) {
        int[] arr = {2, 12, 21, 23};
        int target = 14;
        int[] call_Array = twoSum(arr, target);
        System.out.println(Arrays.toString(call_Array));
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] index = new int[2];
        for (int i = 0; i < nums.length; ++i) {
            for (int j = i + 1; j < nums.length; ++j) {
                if (target == nums[i] + nums[j]) {
                    index[index.length - 2] = i;
                    index[1] = j;
                }
            }
        }
        return index;
    }
}
