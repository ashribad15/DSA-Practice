class Solution {
    public String[] findRelativeRanks(int[] score) 
    {
        int a[]= new int[score.length];
        String f[]= new String[score.length];
        HashMap<Integer,String> map = new HashMap<>();
        

        for(int i=0;i<score.length;i++)
        {
             a[i]=score[i];
        }
         Integer[] b = Arrays.stream(a).boxed().toArray(Integer[]::new);
        Arrays.sort(b,Collections.reverseOrder());
        for(int i=0;i<b.length;i++)
        {
            if(i==0)
            map.put(b[i],"Gold Medal");
            else if(i==1)
            map.put(b[i],"Silver Medal");
            else if(i==2)
            map.put(b[i],"Bronze Medal");
            else
            {
                int y=i+1;
                 map.put(b[i],Integer.toString(y));
            }
            
        }

        for(int i=0;i<score.length;i++)
        {
            f[i]=map.get(score[i]);
        }
        
        return f;
    }
}
