class Solution {
    public boolean hasDuplicate(int[] nums) {
        List<Integer> set = new ArrayList<>();

        for(int i: nums){
            if(set.contains(i)){
                return true;
            }
            set.add(i);
        }

        return false;
    }
}