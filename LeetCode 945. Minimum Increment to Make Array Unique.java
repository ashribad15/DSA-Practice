class Solution {
    public int minIncrementForUnique(int[] nums)
     {
        Arrays.sort(nums);
        int s=0;
        
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]<=nums[i-1])
            {
                     s=s+(nums[i-1]-nums[i])+1;
                     nums[i]=nums[i-1]+1;

            }
        }

        return s;
        
    }
}
