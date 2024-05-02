class Solution {
    public String reversePrefix(String word, char ch) 
    {
        int d= word.indexOf(ch);
        String s="";

        for(int i=0;i<word.length();i++)
        {
            char ch1=word.charAt(i);

            if(i<=d)
            {
                s=ch1+s;
            }
            else
            {
                s=s+ch1;
            }

        }

        return s;
        
    }
}
