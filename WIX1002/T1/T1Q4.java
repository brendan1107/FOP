import java.util.Random;
import java.util.Scanner;

public class T1Q4{
    public static void main(String[] args) {
        int rand1 =0;
        int rand2 =0;
        int MAX = 6;
        System.out.println("It's player1's turn to roll a dice, type 1 to continue");
        Scanner _x = new Scanner(System.in);
        int continue1 = _x.nextInt();
        if( continue1 == 1) {
        System.out.println("Rolling dice....");
        Random x = new Random();
        rand1 = x.nextInt(MAX) +1;
        System.out.println("Player 1 rolled " + rand1);}
        else {System.out.println ("Action Cancelled");
    } 
        
        System.out.println("It's player2's turn to roll a dice, type 1 to continue");
        Scanner _x2 = new Scanner(System.in);
        int continue2 = _x2.nextInt();
        if( continue2 == 1) { 
        System.out.println("Rolling dice....");
        Random x2 = new Random();
        rand2 = x2.nextInt(MAX) +1;
        System.out.println("Player 2 rolled " + rand2);}
        else {System.out.println("Action Cancelled");
    }

    if (rand1 > rand2) {System.out.println("Player 1 won the game."); }
    else if (rand1 < rand2) {System.out.println("Player 2 won the game.");}
    else if (rand1 == rand2) {System.out.println("It's a tie.");}
    _x.close();
    _x2.close();    
}
    
    }