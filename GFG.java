import java.util.Arrays;
import java.util.Scanner;

public class GFG {
    public static String sortString(String inputString) {
        char tempArray[] = inputString.toCharArray();
        Arrays.sort(tempArray);
        return new String(tempArray);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a string");
        String inputString = sc.nextLine();
        String outputString = sortString(inputString);
        System.out.println("Input String : " + inputString);
        System.out.println("Output String : "
                           + outputString);
    }
}