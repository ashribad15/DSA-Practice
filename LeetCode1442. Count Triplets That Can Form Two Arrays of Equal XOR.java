class Solution {
    public int countTriplets(int[] arr) 
    {
        int n = arr.length;
        int pxor[]= new int[n+1];
        pxor[0]=0;

        for(int i=0;i<n;i++)
        {
            pxor[i+1]=pxor[i]^arr[i];
        }

          int s=0;
          
        for(int i=0;i<pxor.length;i++)
        {
            for(int k=i+1;k<pxor.length;k++)
            {
                if(pxor[i]==pxor[k])
                {
                    s=s+(k-i-1);
                }
            }
        }

        return s;
        
    }
}
