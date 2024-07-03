class Solution 
{
    public int minDifference(int[] nums)
     {

        Arrays.sort(nums);

        if(nums.length<=4)
        return 0;

        int ans = Integer.MAX_VALUE;

        for(int i=0;i<=3;i++)
        {
              ans = Math.min(ans, (nums[nums.length-4+i]-nums[i]));
        }


        return ans;

        
    }
}
