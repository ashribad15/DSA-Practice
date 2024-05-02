class Solution {
    public int findMaxK(int[] nums) 
    {
        HashSet<Integer> set = new HashSet<>();
        Arrays.sort(nums);
        int u=0;

        for(int i=0;i<nums.length;i++)
        {
               if(nums[i]<0)
               set.add(nums[i]);

               if(nums[i]>0 && set.contains(-nums[i]))
               {
                u=nums[i];
               }

        }

        if(u!=0)
        return u;
        else
        return -1;
        
    }
}
