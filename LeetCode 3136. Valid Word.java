class Solution {
    public boolean isValid(String word) 
    {
        int l = word.length();
        boolean hasVowel = false, hasConsonant = false;

        if (l < 3) {
            return false;
        }

        for (char c : word.toCharArray()) {
            if (Character.isDigit(c)) {
                continue;
            }
            
            if (isVowel(c)) {
                hasVowel = true;
            } else if (Character.isLetter(c)) {
                hasConsonant = true;
            } else {
                return false; 
            }
        }

        return hasVowel && hasConsonant;
    }

    private boolean isVowel(char ch) 
    {
        return (ch == 'a' || ch == 'e' ||  ch == 'i' || ch == 'o' ||  ch == 'u' ||
               ch == 'A' || ch== 'E'||  ch == 'I'||  ch == 'O'||  ch == 'U');
    }
}
