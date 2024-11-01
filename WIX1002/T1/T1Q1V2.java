import java.util.Scanner;
    public class T1Q1V2 {
        public static void main(String[]args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter the number of inputs in next operation");
            int inputNum = sc.nextInt();
            double[] num = new double[inputNum];

            for (int i = 0 ; i < inputNum ;  i++) {
            System.out.println("Please enter the input");
            num[i]= sc.nextDouble();}
            
            String operationType = "";
            double answer = 0;
            if (num.length >2) 
        {
            System.out.println("Please select your opeartion by enter number 1 or 2");
            int operationControlNum = sc.nextInt();

            switch(operationControlNum) 
            
            {
            case 1:  operationType = "addition";
            for (int i = 0 ; i < inputNum ;  i++) {
                     answer += num[i];}
                    break;
            case 2 : operationType = "subtraction";
            for (int i = 0 ; i < inputNum ;  i++) {
                answer -= num[i];
                    break;}
            }  
        }
            else if (num.length == 2) {
                System.out.println("Please select your opeartion by enter number 1 to 4");
                int operationControlNum = sc.nextInt();
            switch(operationControlNum) {
            case 1:
                for (int i = 0 ; i < inputNum ;  i++) {
                answer += num[i];}
                break;
           case 2 : operationType = "subtraction";
                for (int i = 0 ; i < inputNum ;  i++) {
                answer -= num[i];
                   break;}
            case 3: operationType = "multiplication";
                answer = num [1] * num [2];
            case 4: operationType ="division";
                if (num[2]==0) {System.out.println("Division by zero is not allowed.");
                return;} 
                else answer = num[1]/ num[2];
            }
        }

            System.out.println("operation is " + operationType + "\nThe answer is " +answer );
    }
}