import java.util.Arrays;
import java.util.Scanner;
public class T3Q1D {
    public static void main(String[] args) {
    System.out.println("Please enter your input");
    Scanner sc = new Scanner(System.in);
    String inputString = sc.nextLine();
    String inputStringLowerCase = inputString.toLowerCase();
    char[] tempArray =inputStringLowerCase.toCharArray();
    Arrays.sort(tempArray);

    for(int i =0; i < inputString.length() ; i++)
    
    System.out.print(tempArray[i]);

    }
}