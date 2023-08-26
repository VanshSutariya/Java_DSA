import java.util.*;

public class Foursum {

    public static List<List<Integer>> foursum(int[] nums, int target) {
        Arrays.sort(nums);
        Set<ArrayList<Integer>> set = new LinkedHashSet<>();

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int start = j + 1;
                int end = nums.length - 1;
                while (start < end) {
                    int sum = nums[i] + nums[j] + nums[start] + nums[end];
                    if (sum > target) {
                        end--;
                    } else if (sum < target) {
                        start++;
                    } else {
                        ArrayList<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[start]);
                        list.add(nums[end]);
                        set.add(list);

                        start++;
                        end--;
                    }
                }
            }
        }

        return new ArrayList<>(set);
    }

    public static void main(String[] args) {
        int[] nums = { 1, 0, -1, 0, -2, 2 };
        int target = 0;
        List<List<Integer>> ans = new ArrayList<>();
        ans = foursum(nums, target);
        for (int i = 0; i < ans.size(); i++) {
            System.out.println(ans.get(i));
        }

    }
}
