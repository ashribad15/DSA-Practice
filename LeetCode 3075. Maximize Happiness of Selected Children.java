class Solution {
    public long maximumHappinessSum(int[] happiness, int k) 
    {
         Arrays.sort(happiness);
        long ans = 0;
        int c = 0;
        for (int i = happiness.length - 1; i >= 0; i--)
        {
            ans += Math.max(0, happiness[i] - c);
            c++;
            if (c >= k) {
                break;
            }
        }
        return ans;
    }
}
