class Solution {
    public int countDays(int days, int[][] meetings)
     {
        Arrays.sort(meetings,(a,b)->Integer.compare(a[0],b[0]));
        int free=0, last=0;


        for(int i=0;i<meetings.length;i++)
        {
            int start = meetings[i][0];
            int end = meetings[i][1];

            if(start>last+1)
            {
              free=free +(start-last-1);
            }

            last = Math.max(last,end);
        }

        if(last<days)
           {
            free=free+(days-last);

           }

        return free;
        
    }
}
