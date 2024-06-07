class Solution {
    public String replaceWords(List<String> dictionary, String sentence)
     {
        sentence=sentence+" ";
        String s=""; String b="";
         int l = sentence.length();

        for(int i=0;i<l;i++)
        {
            char ch = sentence.charAt(i);
             if(ch!=' ')
             b=b+ch;
             else
             {
                for(String word : dictionary )
                {
                    if(b.startsWith(word))
                    b=word;
                }
                
                s=s+b +" ";
                b="";
             }
        }
        s=s.trim();

        return s;
    }
}
