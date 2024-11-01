import java.util.Scanner;

public class T1Q3 {
public static void main(String[] args){
System.out.print("Please enter your mark: ");
Scanner x = new Scanner(System.in);
int mark = x.nextInt();
System.out.println("Mark: " + mark);
if (mark >= 40 && mark <= 100) {System.out.println("You passed.");}
else if (mark < 40 && mark >=0) {System.out.println("You failed");}
else {System.out.println("Error: Invalid Input , the mark should be within 0 and 100");}

    }
}