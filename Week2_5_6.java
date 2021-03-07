import java.util.Scanner;
import java.util.Arrays;
public class Week2_5_6{
    static void show(int a[]){
        for(int i = 0; i < a.length; i++){
            System.out.printf(a[i]+" ");
        }
        System.out.println();
    }
    static void swap(int a, int b){
        int c = 0;
        c = a;
        a = b;
        b = c;
    }
    static void add(int a[]){
        int sum = 0;
        for(int i = 0; i < a.length; i++) sum += a[i];
        System.out.println("sum array: "+ sum);
    }
    static void middle(int a[]){
        Arrays.sort(a);
        if(a.length % 2 == 1) System.out.println("Average number: "+a[(a.length-1)/2]);
        else System.out.println("Average number: "+a[(a.length/2)-1]);
    }
    public static void main(String[] args){
        Scanner Sc = new Scanner(System.in);
        System.out.printf("Input length of the string A: ");
        int n = Sc.nextInt();
        int A[] = new int[n];
        for(int i = 0; i < n; i++){
            System.out.printf("Input A[%d]: ",(i+1));
            A[i] = Sc.nextInt();
        }
        show(A);
        add(A);
        Arrays.sort(A);
        System.out.println("Sort the string: ");
        show(A);
        middle(A);
    }
}