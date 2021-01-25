public class Offer12 {
    //怎么避免重复访问问题，当失败之后全部回滚，包括已经访问过的点和增加的序列！！！！
    int visit[][];
    int m,n;
    String word;
    char[][] board;
    int index;
    public boolean exist(char[][] board, String word) {
        this.word = word;
        this.board = board;
        index = 0;
        m = board.length;
        n = board[0].length;
        visit = new int[m][n];
        for(int x=0;x<m;x++){
            for(int y=0;y<n;y++){
                visit[x][y] = 0;
            }
        }
        boolean ans = false;
        for(int x=0;x<m;x++){
            for(int y=0;y<n;y++){
                ans = expend(x,y);
                if(ans == true)return true;
            }
        }
        return false;


    }

    public boolean expend(int x,int y){

        if(visit[x][y] == 1)return  false;
        if(board[x][y] != word.charAt(index)){
            return false;
        }
        if(index == word.length()-1) return true;

        index++;
        visit[x][y] = 1;

        boolean up,down,left,right;
        if(y-1>=0){
            left = expend(x,y-1);
        }else{
            left =  false;
        }
        if(y+1<n)right = expend(x,y+1);
        else right = false;

        if(x-1>=0)up = expend(x-1,y);
        else up = false;

        if(x+1<m)down = expend(x+1,y);
        else down = false;


        if(up||down||left||right)
            return true;
        else
        {
            visit[x][y] = 0;
            index--;
            return false;
        }

    }
}
