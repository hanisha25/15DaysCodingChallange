class Solution {
    int n, m;
    int row[] = { -1, 0, 1, 0 };
    int col[] = { 0, 1, 0, -1 };

    public boolean exist(char[][] board, String word) {
        n = board.length;
        m = board[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (dfs(board, word, 0, i, j)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean dfs(char[][] board, String word,int idx,int i , int j)
    {
        if(idx==word.length())
        {
           return true;
        }
        if(i<0 || i>=n || j<0 || j>=m || board[i][j]!=word.charAt(idx))
        {
            return false;
        }
        char ch=board[i][j];
        board[i][j]='*';
        for(int k=0;k<4;k++)
        {
            int r=i+row[k];
            int c=j+col[k];
            if(dfs(board,word,idx+1,r,c))
            {
                return true;
            }
        }
        board[i][j]=ch;
        return false;
    }
}