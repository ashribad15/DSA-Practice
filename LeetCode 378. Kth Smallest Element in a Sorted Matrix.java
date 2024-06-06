class Solution {
    public int kthSmallest(int[][] matrix, int k) 
    {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
         
        for(int i=0;i<matrix.length;i++)
        {
          for(int j=0;j<matrix[i].length;j++)
          {
            pq.add(matrix[i][j]);
          }
        }
     
     int f=0; int u=0;
        while(f<k)
        {
            u = pq.poll();
            f++;
        }

        return u;
        
    }
}
    
