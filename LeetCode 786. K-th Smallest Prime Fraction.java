class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) 
    {
       int n =arr.length;
       PriorityQueue<double[]> p = new PriorityQueue<>((a,b)->Double.compare(b[0],a[0]));
       for(int i=0;i<n;i++)
       {
        for(int j=i+1;j<n;j++)
        {
            double div = (double) arr[i]/arr[j];
            p.offer(new double[]{div,(double)arr[i],(double)arr[j]});

            if(p.size()>k)
            p.poll();
        }
       } 

       double[] ans = p.poll();
       return new int[]{(int)ans[1],(int) ans[2]}; 
    }
}
