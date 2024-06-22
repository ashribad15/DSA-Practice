class Solution 
{
    public int numberOfSubarrays(int[] nums, int k) 
    {
      HashMap<Integer, Integer> map = new HashMap<>();
      int c=0,s=0;

        map.put(0,1);

      for(int i=0;i<nums.length;i++)
        {
          if(nums[i]%2==1)
            c++;
          
         if( map.contains(c-k))
         {
           s=s+map.get(c-k);
         }

          map.put(c,map.getOrDefault(c,0)+1);
        }

      return s;
    }
}

