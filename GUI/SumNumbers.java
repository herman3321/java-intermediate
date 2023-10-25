package GUI;

import javax.swing.JOptionPane;

public class SumNumbers {

    public static void main(String[] args){
        String FNumber = JOptionPane.showInputDialog("Enter first number");
        String SNumber = JOptionPane.showInputDialog("Enter second Number");

        int number1= Integer.parseInt(FNumber);
        int number2= Integer.parseInt(SNumber);

        int sum = number1+number2;

        JOptionPane.showMessageDialog(null, "The Sum is " +sum,
        "sum of two integers", JOptionPane.PLAIN_MESSAGE);
    }
    
}