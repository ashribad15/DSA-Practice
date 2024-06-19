class solution 
{
  public int minDays(int[] bloomDay, int m, int k)
     {
       int y = bloomDay.length;
       if(m*k > y)
         return -1;

       int max =bloomDay[0];
       
  for(int i=0;i<y;i++)
    {
       if(bloomDay[i] >max)
         max = bloomDay[i];
    }

    int days=0;

   int min=0;

  while(min<=max)
    {
      int mid = min+(max-min)/2;
      if(ispossible( bloomDay, mid, k) >=m)
      {
        days=mid;
        max=mid-1;
      }
      else
      {
        min =mid+1;
      }

    }
       return days;

     }

  public static int ispossible(int b[] , int m , int k)
  {
    int cc=0,bc=0;

    for(int i=0;i<b.length;i++)
      {
        if(b[i]<=mid)
          cc++;
        else
          cc=0;

        if(cc==k)
        {
          bc++;
          cc=0;
        }
      }

    return bc;
    
  }
}
