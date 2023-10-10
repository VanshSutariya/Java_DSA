class Solution {
    public int[] productExceptSelf(int[] nums) {
        int [] result = new int[nums.length];
        int product = 1;
        for( int i=0;i<nums.length;i++){
            product = product*nums[i];
            result[i] = product;
        }
        product =1;
        for( int i=nums.length-1;i>0;i--){
            result[i] = result[i-1]*product;
            product = product*nums[i];
        }
        result[0]=product;
        return result;
    }
}