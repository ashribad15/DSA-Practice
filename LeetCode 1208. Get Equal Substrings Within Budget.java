class Solution 
{
    public int equalSubstring(String s, String t, int maxCost) 
    {
        int n = s.length();

        int cost=0,l=0;

        int i=0,j=0;
        while(j<n)
        {
            cost=cost+(Math.abs((int)(s.charAt(j)-t.charAt(j))));

            while(cost>maxCost)
            {
                cost=cost-(Math.abs((int)(s.charAt(i)-t.charAt(i))));
                i++;
            }

            l=Math.max(l,(j-i+1));
            j++;
        }

        return l;
        
    }
}
