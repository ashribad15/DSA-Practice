class Solution 
{
    public int check(int a, int b) 
    {
        int c = 0, f = 0, l = 1;
        while (a > 0 || b > 0)
         {
            if (f == 0) {
                if (a >= l) {
                    a -= l;
                } else {
                    break;
                }
            } else {
                if (b >= l) {
                    b -= l;
                } else {
                    break;
                }
            }
            c++;
            l++;
            f = f ^ 1;
        }
        return c;
    }

    public int maxHeightOfTriangle(int r, int b) {
        int k1 = check(r, b);
        int k2 = check(b, r);
        return Math.max(k1, k2);
    }
}

// important - f=f^1 toggles f between 0 and 1 in each iteration. XOR (^) with 1 flips the bit
