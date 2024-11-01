public class L1Q3 {
    public static void main(String[] args) {
        for(int i = 0; i < 7 ; i++) {
            for (int j =0; j <7 ; j++) {
                if( i==0 || i==6 || j ==0 || j== 6) {
                    System.out.print("*");}
                    else {System.out.print(" ");
                }
            
            }
            System.out.println("");
            }
            System.err.println(" ");
        
        for (int i=0 ; i <7 ; i++) {
            for (int j =0; j<7; j++) {
                if ( i==0 && j>1 && j <5 || j==0 && i >1 && i <5 || j == 6 && i>1 && i<5||
                i==1 && j ==1 || i==1 && j==5 || i==5 && j==5 || i==5 && j ==1 || i==6 && j>1 && j<5) {
                    System.out.print("*"); 
                } else {System.out.print(" ");}
            }
            System.out.println("");
        }    

        System.out.println(" ");


        for (int i =0 ; i<8; i++) {
            for (int j=0 ; j<7; j++) {
                if( j==3 || i ==2 || i==1 && j ==2 || i==1 && j==4) {
                    System.out.print("*");
                } else {System.out.print(" ");}
        }
        System.out.println(" ");
        }
System.out.println(" ");


        for (int i=0; i<7 ; i++) {
            for (int j =0; j<7 ; j++) {
                if ( i+j ==3 || j-i==3 || i+j ==9 || i-j==3) {System.out.print("*");} else {System.out.print(" ");}
            }
            System.out.println(" ");
        }
    }
}