package Codeforces;
import java.util.Scanner;
public class TooLongWord {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
String s = scanner.nextLine();
scanner.close();
int letterCount =0;
for (int i = 0 ; i < s.length() ; i++) {
    if (Character.isLetter(s.charAt(i))) {
        letterCount++;}
        else if(letterCount <10) {System.out.println("The input is not valid");
    return;}
}        

if (letterCount>=10) {letterCount-=2; System.out.println("The abbreviation for the character that user wrote is " + s.charAt(0) + letterCount + s.charAt(s.length()-1));}
    }
}
