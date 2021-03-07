import java.util.Scanner;
public class Week2_5_5 {
    public static Scanner Sc = new Scanner(System.in);
    static int InsertMonth(String Month){
        int a=0;
        switch(Month){
            case "1": 
            case "Jan":
            case "Jan.":
            case "January":
                a = 1;
                break;
            case "2":
            case "Feb":
            case "Feb.":
            case "February": 
                a = 2;
                break;
            case "3":
            case "Mar":
            case "Mar.":
            case "March":
                a = 3;
                break;
            case "4":
            case "Apr":
            case "Apr.":
            case "April": 
                a = 4;
                break;
            case "5":
            case "May":
                a = 5;
                break;
            case "6":
            case "Jun":
            case "June":
                a = 6;
                break;
            case "7": 
            case "Jul":
            case "July":
                a = 7;
                break;
            case "8": 
            case "Aug":
            case "Aug.":
            case "August":
                a = 8;
                break;   
            case "9": 
            case "Sep":
            case "Sep.":
            case "September":
                a = 9;
                break;    
            case "10": 
            case "Oct":
            case "Oct.":
            case "October":
                a = 10;
                break;    
            case "11": 
            case "Nov":
            case "Nov.":
            case "November":
                a = 11;
                break; 
            case "12": 
            case "Dec":
            case "Dec.":
            case "December":
                a = 12;
                break;    
            default: 
                System.out.println("Error!"); 
                System.exit(0);
        }
        return(a);
    }
    static void InsertYear(int y, int c){
        
        if(y<1800 || y>2100) {
            System.out.printf("Error!"); 
            System.exit(0);}
        else{
            if(y%4==0){
                if(y%100==0 && y%400!=0) c = 0;
                else c=1;}
        }
    }
    static void DayInMonth(int m, int y, int check) {
        switch(m){
            case 2:
                if(check == 1) System.out.println("Year "+y+ " month " +m+ ": 29 days");
                else System.out.println("Year "+y+ " month " +m+ ": 28 days");
                break;
            case 4: 
            case 6:
            case 9:
            case 11: 
                System.out.println("Year "+y+ " month " +m+ ": 30 days");
                break;
            default: 
                System.out.println("Year "+y+ " month " +m+ ": 31 days");
                break;
        }
    }
    public static void main(String[] args){
        int year;
        int m;
        int check = 0;
        System.out.printf("Insert year: ");
        year = Sc.nextInt();
        InsertYear(year, check);
        Sc.nextLine();
        System.out.printf("Insert month: ");
        String Month = new String();
        Month = Sc.nextLine();
        m = InsertMonth(Month);

        DayInMonth(m, year, check);

    }
}
