package Lab1;
import javax.swing.JOptionPane;
public class PhepToan {
    public static void main(String args[]){
        String strNum1, strNum2;
        String strNotification = "You've just entered: ";
        Double cong, tru, nhan, chia;
        strNum1 = JOptionPane.showInputDialog(null, "Please input the first number: ","Input the first number", JOptionPane.INFORMATION_MESSAGE);
        strNotification+= strNum1 + " and ";
        double num1 = Double.parseDouble(strNum1); // convert string to double

        strNum2 = JOptionPane.showInputDialog(null, "Please input the second numer: ", "Input the second number", JOptionPane.INFORMATION_MESSAGE);
        strNotification += strNum2;
        double num2 = Double.parseDouble(strNum2);
        JOptionPane.showMessageDialog(null, strNotification, "Show two numbers", JOptionPane.INFORMATION_MESSAGE);
        cong = num1 + num2;
        tru = num1 - num2;
        nhan = num1 * num2;
        chia = num1/num2;
        JOptionPane.showMessageDialog(null, cong, "Cong", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, tru, "Tru", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, nhan, "Nhan", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, chia, "Chia", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}