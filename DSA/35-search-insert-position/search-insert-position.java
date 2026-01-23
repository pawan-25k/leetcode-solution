class Solution {
    public int searchInsert(int[] nums, int target) {
        int index=-1;
        for(int i=0;i<nums.length;i++){
            if(target==nums[i]){
                index=i;
                break;
            }else if(target<nums[i]){
                index=i;
                break;
            }else{
                index=i+1;
                
            }
        }
        return index;
    }
}