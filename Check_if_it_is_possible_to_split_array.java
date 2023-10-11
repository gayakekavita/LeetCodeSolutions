class Check_if_it_is_possible_to_split_array{
      
    public boolean canSplitArray(List<Integer> nums, int m) {
         int n=nums.size();
        if(2>=n) return true;
        
        for(int i=0;i<n-1;i++)
        {
            if(nums.get(i)+nums.get(i+1)>=m)
            { 
                return true;
            }
        }
        return false;
        
    }
}
