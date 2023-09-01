public class Solution {
    public void rotate(int[] nums, int k) {
        int[] arr = new int[nums.length];
        int n = 0;
        int a = nums.length;
        for (int i = 0; i < a; i++) {
            arr[(i + k) % a] = nums[i];
            n++;
        }
        int p = 0;
        for (int u : arr) {
            nums[p] = u;
            p++;
        }
    }
}
