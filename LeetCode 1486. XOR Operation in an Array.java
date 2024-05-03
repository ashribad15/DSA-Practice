class Solution {
    public int xorOperation(int n, int start) 
    {
        int a[]= new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=start+2*i;
        }
        int s=a[0];

        for(int j=1;j<n;j++)
        {
            s=s^a[j];
        }

        return s;
        
    }
}
