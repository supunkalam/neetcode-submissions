class Solution {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numberToIndex = new HashMap<>(nums.length);
        for (int x = 0; x < nums.length; x++) {
            int missingNumber = target - nums[x];
            Integer missingIndex = numberToIndex.get(missingNumber);
            if (missingIndex != null) {
                return new int[] {missingIndex, x};
            }
            numberToIndex.put(nums[x], x);
        }
        return new int[0];
    }
}