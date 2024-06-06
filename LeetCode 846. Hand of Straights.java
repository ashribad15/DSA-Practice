class Solution 
{
    public boolean isNStraightHand(int[] hand, int groupSize) 
    {
        if(hand.length % groupSize !=0 )
        return false;
        if(groupSize==1)
        return true;

          PriorityQueue<Integer> pq = new PriorityQueue<>();
          for(int i=0;i<hand.length;i++)
          {
            pq.add(hand[i]);
          } 

          while(!pq.isEmpty())
          {
            int x= pq.poll();
            for(int i=1;i<groupSize;i++)
            {
                if(!pq.remove(x+i))
                return false;
            }

          }
    
    return true;
        
    }
}
