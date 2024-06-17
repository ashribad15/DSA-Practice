class Solution 
{
    public void solveSudoku(char[][] board)
     {
        helper(board,0,0);
    }

    public static boolean helper(char [][] board, int r, int c)
    {
        if(r==board.length)
        {
            return true;
        }

        int nr=0,nc=0;

        if(c==board[0].length-1)
        {
            nr=r+1;
            nc=0;
        }
        else
        {
            nc=c+1;
            nr=r;
        }

        if(board[r][c] != '.')
        {
            if(helper(board,nr,nc))
            return true;
        }
        else
        {
            for(int i=1;i<=9;i++)
            {
                if(isSafe(board,r,c,i))
                {
                    board[r][c]= (char)(i+'0');

                    if(helper(board,nr,nc))
                    return true;
                    else
                    board[r][c]='.';
                }
            }
        }

        return false;
    }

    public static boolean isSafe(char board[][], int r, int c, int n)
    {
        for(int i=0;i<board.length;i++)
        {
            if(board[i][c]==(char)(n+'0'))
            return false;
        }

        for(int i=0;i<board.length;i++)
        {
            if(board[r][i]==(char)(n+'0'))
            return false;
        }

        int gr= 3*(r/3);
        int gc = 3*(c/3);

        for(int i=gr;i<gr+3;i++)
        {
            for(int j=gc;j<gc+3;j++)
            {
                if(board[i][j]==(char)(n+'0'))
                return false;
            }
        }

        return true;
    }
}
