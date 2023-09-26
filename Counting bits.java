class Solution {
    public int[] countBits(int n) {

        int[] ans=new int[n+1];
        ans[0]=0;
        for(int i=1;i<=n;i++)
        {
            int tmp=i;
            int count=0;
            while(tmp!=0)
            {
                tmp=tmp & (tmp-1);
                count++;
            }

            ans[i]=count;
        }
        return ans;
    }
}