import java.util.Scanner;
public class T2Q5 {
    public static void main(String[] args) {
      QuestionA();
      QuestionB();
      QuestionC();
      QuestionD();
    }
    public static void QuestionA() {
        double AMOUNT = 32.5;
        AMOUNT += 10;
        System.out.println("The amount is " + AMOUNT);
    }
    public static void QuestionB() {
        String chapter = "Summary";
        System.out.println(chapter);
    }
    public static void QuestionC() {
        int num = 0;
        num++;
        int num1 = num;

    }
    public static void QuestionD() {
        float num = 3000;
        System.out.printf("%4.2f \n" , num);
    }

    public static void QuestionE() {
        String contact;
        Scanner keyboard = new Scanner(System.in);
        contact = keyboard.nextLine();
    }

   
    }