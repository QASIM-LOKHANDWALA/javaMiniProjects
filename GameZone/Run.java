package GameZone;
import java.util.*;

public class Run {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Player 1 Name: ");
        String name1 = sc.nextLine();
        System.out.println("Enter Player 1 Mark: ");
        String temp = sc.nextLine().toUpperCase();
        char m1 = temp.charAt(0);
        System.out.println("Enter Player 2 Name: ");
        String name2 = sc.nextLine();
        char m2;
        if(m1 == 'X'){
            m2 = 'O';
        }else{
            m2 = 'X';
        }

        TicTacToe t = new TicTacToe();
        Players p1 = new Players(name1, m1);
        Players p2 = new Players(name2, m2);

        Players current;
        if(p1.mark == 'X'){
            current = p1;
        }else{
            current = p2;
        }

        do{
            System.out.println(current.name + "'s turn:");
            current.move();
            TicTacToe.diaplayBoard();
            if(TicTacToe.checkWin()){
                System.out.println(current.name + " WON!");
                break;
            }else{
                if(current == p1){
                    current = p2;
                }else{
                    current = p1;
                }
            }
            if(TicTacToe.checkFull()){
                System.out.println("IT'S A TIE");
                break;
            }
        }while(true);

        sc.close();
        
    }
}
