package GameZone;

import java.util.Scanner;

public class Players {
    Scanner sc = new Scanner(System.in);

    String name;
    char mark;
    Players(String name , char mark){
        this.mark = mark;
        this.name = name;
    }

    void move(){
        int row,col;
        do{
            System.out.println("ENTER ROW AND COLUMN: ");
            row = sc.nextInt();
            col = sc.nextInt();
        }while(!checkMove(row, col));
        
        TicTacToe.fillSpace(row,col,mark);
    }
    boolean checkMove(int r,int c){
        if(r>=0 && c>=0 && r<3 && c<3){
            if(TicTacToe.board[r][c] == ' '){
                return true;
            }
            return false;
        }
        return false;
    }
}
