class Solution 
{
    public int maxDistance(int[] position, int m) 
    {
       Arrays.sort(position);
      int l=1,r=position[position.length-1];

      while(l<=r)
        {
          int mid = l+(r-l)/2;

          
              if(check(position,mid,m))
              {
                    result=mid;
                    min=mid+1;
              }
              else
              {
                  max=mid-1;
              }

        }

        return result;
        }

  public static boolean check(int a[], int d, int m)
    {
        int cc=1;
        int last=a[0];

        for(int i=0;i<a.length;i++)
        {
            if(a[i]-last>=d)
            {
                cc++;
                last=a[i];
            }

            if(cc>=m)
            return true;

        }

        return false;
    }
}
      
      
