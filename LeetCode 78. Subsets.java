class Solution {
    public List<List<Integer>> subsets(int[] nums) 
    {
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(new ArrayList<>());

        for(int num : nums)
        {
            int n = ans.size();
            for(int i=0;i<n;i++)
            {
                List<Integer>subset = new ArrayList<>(ans.get(i));
                subset.add(num);
                ans.add(subset);
            }
        }
        return ans;
    }
}
