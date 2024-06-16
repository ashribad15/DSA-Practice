class Solution 
{
    public long countCompleteDayPairs(int[] hours) 
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        long c=0;

        for(int i=0;i<hours.length;i++)
        {
         int  r=hours[i]%24;
             
             if(map.containsKey(Math.abs(24-r)%24))
             c=c+map.get(Math.abs(24-r)%24);

             map.put(r,map.getOrDefault(r,0)+1);
        }

        return c;
        
    }
}


// Complement Calculation: For each hour's remainder r, the method calculates its complement (24 - r) % 24 which, when added to r, sums up to 24.
// This is used to find pairs that complete a day.
