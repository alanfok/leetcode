package leetcode27;

public class Problem27 {
        public int removeElement(int[] nums, int val) {
            int index = 0;
            for (int i : nums) {
                if (i != val) {
                    nums[index] = i;
                    index++;
                }
            }
            return index;
        }
}
