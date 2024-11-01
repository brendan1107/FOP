import java.util.Arrays;
import java.util.Scanner;
public class T3Q1 {
    public static void main(String[] args) {
        QuestionE();

       
    }    
    //=============================================================================================================================================================================================================
    public static void QuestionA() {
        if (3 *8 == 37) System.out.println("it is true that 3x8=27.");
        else System.out.println("It is not true that 3x8=27.");
    }

    //=============================================================================================================================================================================================================
    public static void QuestionB() {
        System.out.println("Please enter the input.");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        if (input%2==0) System.out.println("The input is an even number.");
        else System.out.println("The input is an even number.");
    }
    //=============================================================================================================================================================================================================
    public static void QuestionC() {
        System.out.println("Please enter the character.");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        if (input.length()==1 && Character.isLetter(input.charAt(0)) && Character.isUpperCase(input.charAt(0))) {System.out.println("The character is uppercase."); }
        else if (input.length()==1 && Character.isLetter(input.charAt(0)) && Character.isLowerCase(input.charAt(0)))System.out.println("The character is not upper case but lower case instead.");
        else System.out.println("error");
    }    
    //=============================================================================================================================================================================================================
    public static void QuestionD() {
        System.out.println("Please enter your input");
    Scanner sc = new Scanner(System.in);
    String inputString = sc.nextLine();
    String inputStringLowerCase = inputString.toLowerCase();
    char[] tempArray =inputStringLowerCase.toCharArray();
    Arrays.sort(tempArray);

    for(int i =0; i < inputString.length() ; i++)
    
    System.out.print(tempArray[i]);
    }
    //=============================================================================================================================================================================================================
    public static void QuestionE() {
        System.out.println("Please enter number 0 to 6");
        String[] DaysInAWeek = {"Sunday","Monday" , "Tuesday", "Wednesday", "Thursday" ,"Friday" ,"Saturday"};
        Scanner sc = new Scanner(System.in);
        int inputInt = sc.nextInt();
        if( inputInt >=0 && inputInt <=6) {
        switch(inputInt) {
            case 0: System.out.println(DaysInAWeek[inputInt]);
            break;
            case 1: System.out.println(DaysInAWeek[inputInt]);
            break;
            case 2: System.out.println(DaysInAWeek[inputInt]);
            break;
            case 3: System.out.println(DaysInAWeek[inputInt]);
            break;
            case 4: System.out.println(DaysInAWeek[inputInt]);
            break;
            case 5: System.out.println(DaysInAWeek[inputInt]);
            break;
            case 6: System.out.println(DaysInAWeek[inputInt]);
            break;}        
        } else System.out.println("Error, invalid input");
    }
}
    
        
    



