import java.util.Scanner;

public class Week2_5_4 {
    public static void main(String args[]){
        Scanner Sc = new Scanner(System.in);

        System.out.print("Input height of n: ");
        int n = Sc.nextInt();

        for(int i=0; i<n; i++){
            for(int j = 0; j<(n-i); j++) System.out.print(" ");
            for(int k = 0; k<(2*i); k++) System.out.print("*");
            System.out.println("*");
        }

    }
    
}
