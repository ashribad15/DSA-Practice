class Solution {
    public char findTheDifference(String s, String t)
     {  
        HashMap<Character,Integer> map = new HashMap<>();

        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        HashMap<Character,Integer> map1 = new HashMap<>();

        for(int i=0;i<t.length();i++)
        {
            char ch = t.charAt(i);
            map1.put(ch,map1.getOrDefault(ch,0)+1);
        }

        Set<Character> keys = map1.keySet();
        for(char key : keys)
        {
            if(map.containsKey(key))
            {
                if(map.get(key)==map1.get(key))
                continue;
                else
                return key;
            }
            else
             return key;
        }
    

          return '\0';
    }
}
