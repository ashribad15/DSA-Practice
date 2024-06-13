class Solution 
{
    public int minMovesToSeat(int[] seats, int[] students)
     {
        Arrays.sort(seats);
        Arrays.sort(students);
        int s=0;

        for(int i=0;i<seats.length;i++)
        {
            s=s+(Math.abs(students[i]-seats[i]));
        }

        return s;
    }
}
