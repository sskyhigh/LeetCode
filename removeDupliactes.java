public class removeDupliactes {
    public static void main(String [] args){

    }
    public int removeDuplicates(int [] nums){
        int count = 0;
        for(int i = 0; i<nums.length; ++i){
            if(nums[i] - 1 == nums[i] + 1){
                continue;
            }
        }
        
        return count;
    }
}
