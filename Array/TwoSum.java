import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class TwoSum {
    public static List<List<Integer>> twosum(int[] nums, int target) {
        Arrays.sort(nums);
        Set<ArrayList<Integer>> set = new LinkedHashSet<>();
        int i = 0;
        int j = nums.length - 1;
        while (i < j) {
            int sum = nums[i] + nums[j];
            if (sum > target) {
                j--;
            } else if (sum < target) {
                i++;
            } else {
                ArrayList<Integer> list = new ArrayList<>();
                list.add(i);
                list.add(j);
                set.add(list);
                j--;
                i++;
            }
        }
        return new ArrayList<>(set);

    }

    public static void main(String[] args) {
        int[] nums = { 1, 0, -1, 0, -2, 2 };
        int target = 0;
        List<List<Integer>> ans = new ArrayList<>();
        ans = twosum(nums, target);
        for (int i = 0; i < ans.size(); i++) {
            System.out.println(ans.get(i));
        }

    }
}
