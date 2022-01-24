class Solution {
    public int[] singleNumbers(int[] nums) {
        int ans = 0;
        for(int i = 0; i < nums.length; i++) {
            ans ^= nums[i];
        }
        int div = 1;
        while((div & ans) == 0)
            div <<= 1;
        int a = 0, b = 0;
        for(int i = 0; i < nums.length; i++){
            if((nums[i] & div) == 0)a ^= nums[i];
            else b ^= nums[i];
        }
        return new int[]{a, b};
    }
}