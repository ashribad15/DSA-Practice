class Solution 
{
    public int minKBitFlips(int[] nums, int k)
     {
        int n = nums.length;
         int f=0, ans=0;

         int isflipped[]= new int[n];
         for(int i=0;i<nums.length;++i)
         {
            if(i>=k)
            f=f^isflipped[i-k];

            if(f==nums[i])
            {
                if(i+k>nums.length)
                return -1;

                isflipped[i]=1;
                f=f^1;ans++;
            }
         }

         return ans;
    }
}
