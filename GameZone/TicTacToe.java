

public class TicTacToe {
    static char[][] board;

    TicTacToe(){
        board = new char[3][3];
        intialiseBoard();
    }

    void intialiseBoard(){
        for(int i=0 ; i<board.length ; i++){
            for(int j=0 ; j<board[0].length ; j++){
                board[i][j] =' ';
            }
        }
    }
    static void fillSpace(int r,int c,char ch){
        if(checkEmpty(r,c)){
            board[r][c] = ch;
        }else{
            System.out.println("Invalid position!");
        }
        
    }
    static boolean checkEmpty(int r,int c){
        if(r<3 && r>=0 && c<3 && c>=0){
            return true;
        }
        return false;
    }
    static void diaplayBoard(){
        for(int i=0 ; i<board.length ; i++){
            System.out.println("-------------");
            System.out.print("| ");
            for(int j=0 ; j<board[0].length ; j++){
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }
    static boolean checkWin(){
        for(int i=0 ; i<3 ; i++){
            if(board[0][i] != ' ' && board[0][i] == board[1][i] && board[1][i] == board[2][i]){
                return true;
            }
        }
        for(int i=0 ; i<3 ; i++){
            if(board[i][0] != ' ' && board[i][0] == board[i][1] && board[i][1] == board[i][2]){
                return true;
            }
        }
        if(board[0][0] != ' ' && board[0][0] == board[1][1] && board[1][1] == board[2][2]){
            return true;
        }
        if(board[0][2] != ' ' && board[0][2] == board[1][1] && board[1][1] == board[2][0]){
            return true;
        }
        return false;
    }
    static boolean checkFull(){
        boolean flag = true;
        for(char[] ch:board){
            for(char c:ch){
                if(c == ' '){
                    flag = false;
                }
            }
        }
        return flag;
    }
}
