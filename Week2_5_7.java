import java.util.Scanner;

public class Week2_5_7 {
    public static Scanner Sc = new Scanner(System.in);
    static void InsertMatrix(int arr[][], int Rows, int Columns ){
        for(int i = 0; i < Rows;i++){
            for(int j = 0; j < Columns; j++){
                System.out.printf("Insert Number: ");
                arr[i][j] = Sc.nextInt();
            }
        }
    }
    static void ShowMatrix(int a[][], int Rows, int Columns){
        for(int i = 0; i < Rows;i++){
            for(int j = 0; j < Columns; j++){
                System.out.printf("|\t"+a[i][j]);
            }
            System.out.println("|");
        }

    }
    static void Add2Matrix(int a[][], int b[][], int sum[][], int Rows, int Columns){
        for(int i = 0; i < Rows;i++){
            for(int j = 0; j < Columns; j++){
                sum[i][j] = a[i][j] + b[i][j];
            }
        }
    }

    public static void main(String[] args){
        int r;
        int c;
        System.out.printf("Insert number of row: ");
        r = Sc.nextInt();
        System.out.printf("Insert number of column: ");
        c = Sc.nextInt();
        int arr1[][] = new int[r][c];
        int arr2[][] = new int[r][c];
        int sum[][] = new int[r][c];
        System.out.println("Insert first Matrix:");
        InsertMatrix(arr1, r, c);
        System.out.println("Insert second Matrix:");
        InsertMatrix(arr2, r, c);
        System.out.println("first Matrix:");
        ShowMatrix(arr1, r, c);
        System.out.println("second Matrix:");
        ShowMatrix(arr2, r, c);
        System.out.println("sum:");
        Add2Matrix(arr1, arr2, sum, r, c);
        ShowMatrix(sum , r, c);
        
    }
}
