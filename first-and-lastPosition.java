class first-and-lastPosition {
    public int[] searchRange(int[] nums, int target) {
        int n=nums.length;
        int[] arr=new int[2];
        int firstpos=-1;
        int lastpos=-1;
        for(int i=0;i<n;i++)
        {
            if(firstpos==-1)
            {
              if(nums[i]==target)
              {
                  firstpos=i;

              }
            }
           
              if(nums[i]==target)
              {
                  lastpos=i;
              }
         
        }
        arr[0]=firstpos;
        arr[1]=lastpos;
        return arr;
        
    }
}
