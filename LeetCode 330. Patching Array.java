lass Solution {
    public int minPatches(int[] nums, int n)
     {
        long max =0;
        int i=0,p=0;
        while(max<n)
        {
             if(i<nums.length && nums[i]<= (max+1) )
             {
                  max+=nums[i];
                  i++;
             }
             else
             {
                 max+=(max+1);
                 p++;
             }
        }
        
        return p;
    }
}
