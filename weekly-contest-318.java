class Solution {
    public int[] applyOperations(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n-1;i++)
        {
            if(nums[i]==nums[i+1])
            {
                nums[i]*=2;
                nums[i+1]=0;
            }
            else
            {
                continue;
            }
        }
        int startIndex = 0;
        int i,j,temp;
        for(i=0;i<n;i++){
            if(nums[i] != 0){
                for(j=i; j>startIndex;j--){
                    temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = temp;
                }
                startIndex++;
            }
        }
        return nums;
    }
}
