// Example 5: MathTwoNumbers.java
import javax.swing.JOptionPane;
public class MathTwoNumbers {
    public static void main(String[] args){
        String strNum1;
        String strNum2;
        String math;
        int m;
        double num1;
        double num2;
        double result;

        strNum1 = JOptionPane.showInputDialog(null,"Please input the first number: ","Input the first number",JOptionPane.INFORMATION_MESSAGE);
        num1 = Double.parseDouble(strNum1);

        strNum2 = JOptionPane.showInputDialog(null,"Please input the second number: ","Input the second number",JOptionPane.INFORMATION_MESSAGE);
        num2 = Double.parseDouble(strNum2);

        do{
        math = JOptionPane.showInputDialog(null,"Selesctions: \n1. Sum\n2.Difference\n3.Product\n4.Quotient \nPlease input the number of the math: ","Input the math",JOptionPane.INFORMATION_MESSAGE);
        m = Integer.parseInt(math);
        }while(m<1 || m>4 );

        switch(m){
        case 1:
            result = num1 + num2; 
            JOptionPane.showMessageDialog(null,"Sum of two numbers: "+ result, "Show sum", JOptionPane.INFORMATION_MESSAGE);
            break;

        case 2:
            result = num1 - num2; 
            JOptionPane.showMessageDialog(null,"Difference of two numbers: "+ result, "Show difference", JOptionPane.INFORMATION_MESSAGE);
            break;

        case 3:
            result = num1 * num2;
            JOptionPane.showMessageDialog(null,"Product of two numbers: "+ result, "Show product", JOptionPane.INFORMATION_MESSAGE);
            break;
        case 4:
            if(num2 == 0){
                JOptionPane.showMessageDialog(null,"Can't do the math!", "Error!", JOptionPane.INFORMATION_MESSAGE);
            }else{
                result = num1 / num2;
                JOptionPane.showMessageDialog(null,"Quotien of two numbers: "+ result, "Show Quotien", JOptionPane.INFORMATION_MESSAGE);
            }
            break;
        default: break;
        }
        System.exit(0);
    
    }
}