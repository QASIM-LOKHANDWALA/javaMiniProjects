
import java.util.*;

class numberGuess{
    Scanner sc = new Scanner(System.in);
    Random r = new Random();
    int num;
    numberGuess(){
        num = r.nextInt(100) + 1;
    }
    void start(){
        System.out.println("\n----------------RULES----------------");
        System.out.println("1: YOU HAVE TO GUESS A NUMBER FROM 1 TO 100");
        System.out.println("2: YOU WILL HAVE 6 TRYS BEFORE GAME ENDS\n");
        int guess;
        int count = 0;
        while(count!=6){
            System.out.print("Enter a number: ");
            guess = sc.nextInt();
            if(guess==num){
                System.out.println("\n--------YOU WIN--------\n");
                break;
            }else if(num>guess){
                System.out.println("GUESS SOMETHING A BIT HIGHER!");
            }else if(num<guess){
                System.out.println("GUESS SOMETHING A BIT LOWER!");
            }
            count++;
        }
        System.out.println("\nGAME ENDED");
        System.out.println("THE NUMBER WAS : " + num);
    }

}