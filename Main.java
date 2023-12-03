import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        System.out.println((new Solution()).subarraySum(nums, 3));
    }
}

class Solution{
    public int subarraySum(int[] nums, int k){
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int sum = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if(map.containsKey(sum - k)){
                count += map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum,0) + 1);
        }
        return count;
    }
}
