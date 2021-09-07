import java.util.*;
class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int item = 0;item< nums.length; item++){
            if(map.containsKey(nums[item])){
                return new int[]{item, map.get(nums[item])};
            } else {
                map.put(target - nums[item], item);
            }
        }
        return null;
    }
    }

    public static void main(String[] args) {
        int[] result = twoSum(new int[]{3, 2, 4}, 6);
        for (int item: result) {
            System.out.print(item);       
        }
    }
}