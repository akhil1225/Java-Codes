import java.util.*;

public class TwoSum {
    public static int[] findTwoSum(int[] nums, int target){
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i<nums.length; i++){
            int comp = target - nums[i];
            if(map.containsKey(comp)){
                return new int[] {map.get(comp), i};
            }
            map.put(nums[i], i);
        }
        return new int[] {-1, -1};
    }


    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 13;
        int[] res = findTwoSum(nums, target);
        System.out.println(res[0]+" "+res[1]);
    }
}
