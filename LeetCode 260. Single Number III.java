class Solution 
{
    public int[] singleNumber(int[] nums) 
    {
       long xor=0;
         
       for(int i=0;i<nums.length;i++)
       {
            xor=xor^nums[i];
       }    

       long mask = xor&(-xor);   //important (mane rakhibaku padiba.)

       int ga=0;
       int gb=0;

       for(int i=0;i<nums.length;i++)
       {
        if((nums[i] & mask) !=0)
        ga=ga^nums[i];
        else
        gb=gb^nums[i];
       }
  
  int a[]= new int[2];
  a[0]=ga;
  a[1]=gb;

       return a;


    }
}
