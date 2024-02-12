import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Intersection349 {
    public static void main(String[] args) {
        int [] nums1 = new int[]{1,2,2,1};
        int [] nums2 = new int[] {2,2};
        int [] inter = intersection(nums1, nums2);
        System.out.println(Arrays.toString(inter));
    }
    public static int[] intersection(int [] nums1, int []nums2){
        HashSet<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i<nums1.length; ++i){
            set.add(nums1[i]);
        }
        for(int i = 0; i<nums2.length; ++i){
            if(set.contains(nums2[i])){
                list.add(nums2[i]);
            }
            set.remove(nums2[i]);
        }
        int [] array = new int[list.size()];
        for(int i = 0; i<array.length; ++i){
            array[i] = list.get(i);
        }
        return array;
    }
}
