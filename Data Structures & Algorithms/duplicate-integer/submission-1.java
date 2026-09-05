class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> numbers = new HashSet<>();
        //O(N)
        for(int x=0;x<nums.length;x++){
            int numberToCheck = nums[x];
            //O(1)
            if(numbers.contains(numberToCheck)){
                return true;
            }
            numbers.add(numberToCheck);
        }
        return false;
    }
}