package Java_hw_5;

public class Task_3 {
    private char [][] board;
    private int size;

    public Task_3(int size){
        this.board = new char[size][size];
        this.size = size;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                board[i][j] = '0';
            }
        }
    }
    private boolean isValid(int row, int col){
        for (int i = 0; i < size; i++) {
            if(board[row][i] == 'X' || board[i][col] == 'X'){
                return false;
            }
        }
        for(int i = row, j=col; i>=0 && j>=0; i--,j--){
            if(board[i][j] == 'X'){
                return false;
            }
        }
        for(int i = row, j=col; i<size && j>0;i++,j--){
            if(board[i][j] == 'X'){
                return false;
            }
        }
        return true;
            
        }
        private boolean placeQueens(int col){
            if(col == size){
                return true;
            }
            for (int i = 0; i < size; i++) {
                if(isValid(i, col)){
                    board[i][col] = 'X';
                    if(placeQueens(col+1)){
                        return true;
                    }
                    board[i][col] = '0';
                }
                
            }
            return false;
        }
        public void showResult(){
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    System.out.print(board[i][j] +" ");
                    
                }
                System.out.println();
                
            }
        }
        public static void main(String[] args) {
            Task_3 board = new Task_3(8);
            board.placeQueens(0);
            board.showResult();
        }
    }

