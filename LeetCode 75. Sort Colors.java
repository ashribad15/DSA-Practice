class Solution 
{
    public void sortColors(int[] nums) 
    {
        int r=0,w=0,b=0;
         
         for(int i=0;i<nums.length;i++)
         {
            if(nums[i]==0)
            r++;
            if(nums[i]==1)
            w++;
            if(nums[i]==2)
            b++;
         }

         for(int i=0;i<nums.length;i++)
         {
            if(r>0)
            {
                nums[i]=0;
                r--;
            }
            else if(r==0 && w>0)
            {
                nums[i]=1;
                w--;
            }
            else if(w==0 && b>0)
            {
                nums[i]=2;
                b--;

            }
         }

        
    }
}
