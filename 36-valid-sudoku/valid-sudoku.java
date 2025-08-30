class Solution {
    public boolean isValidSudoku(char[][] board) {
        //very siimple : just 3 conditions to look for
        //if we found an element during traversal
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                if(board[i][j]!='.'){
                    if(!valid(board, i, j, board[i][j])) 
                        return false;
                }
            }
        }
        return true;
    }
    boolean valid(char[][] board, int i, int j, char num){
        //colCheck
        for(int tem=0; tem<9; tem++)
            if(tem!=j && board[i][tem]==num) return false;
        //rowCheck
        for(int tem=0; tem<9; tem++)
            if(tem!=i && board[tem][j]==num) return false;

        //setCheck
        int rowStart=6;
        int colStart=6;

        if(i<3) rowStart=0;
        else if(i<6) rowStart=3;
        
        if(j<3) colStart=0;
        else if(j<6) colStart=3;

        //now check
        for(int k=rowStart; k<rowStart+3; k++){
            for(int l=colStart; l<colStart+3; l++){
                if(!(k==i && l==j) && board[k][l]==num)
                    return false;
            }
        }
        return true;
    }
}