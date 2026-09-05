class Solution {
    public static int[] twoSum(int[] nums,int target){
        HashMap<Integer, Integer> numberToIndex = new HashMap<>(nums.length);
        for(int x=0;x<nums.length;x++ ){
            int missingNumber = target - nums[x];
            if(numberToIndex.containsKey(missingNumber)){
                int missingIndex = numberToIndex.get(missingNumber);
                return new int[]{ missingIndex,x};
            }
            numberToIndex.put(nums[x],x);
            
        }
        return new int[0];
    }
}