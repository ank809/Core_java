public class N_queens {
    public static void main(String[] args) {
        int n=4;
        boolean board[][]= new boolean[n][n];
       System.out.println(queen(board, 0)); 
    }
    
static int queen(boolean [][]board, int row){
    if(row==board.length){
        display(board);
        return 1;
    }
  // for placing the row and checking  for every row and column
    int count=0;
    for(int col=0; col<board.length; col++){
        if(isSafe(board, row, col)){
            board[row][col]= true;
               count+= queen(board, row+1);
               board[row][col]= false;
        }
    }
    return count;
}
static void display(boolean [][] board){
    for(boolean[] row:board){
        for(boolean element:row){
            if(element){
                System.out.print("Q");
            }
            else{
                System.out.print("X"); 
            }
        }
        System.out.println();
    }
}
static boolean isSafe(boolean [][]board, int row, int col){
    // for vertical
    for(int i=0; i<row; i++){
        if(board[row][col]){
            return false;
        }
    }
    // for diagonal left
    int minLeft= Math.min(row, col);
    for(int i=1; i<minLeft; i++){
        if(board[row-i][col-i]){
            return false;
        }
    }
    // diagonal right
    int maxRight= Math.min(row, board.length-1-col);
    for(int i=1; i<maxRight; i++){
        if(board[row-i][col+i]){
            return false;
        }
    }
    return true;
}
}
