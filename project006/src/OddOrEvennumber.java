import javax.swing.*;
import java.util.Scanner;

public class OddOrEvennumber {
private  static Scanner scan;

    static {
    scan = new Scanner(System.in);
   }
    public static void start(){
         double   firstNumber;

         try {
             System.out.println("welcome to the OddOrEven number ");

             System.out.println("Enter the number: ");
             firstNumber = scan.nextDouble();
             oddOrEven(firstNumber);
         } catch (Exception e) {
             System.out.println("InValid Number");
             scan.nextLine();
             start();
         }
    }
    public static void oddOrEven(double firstNumber){
        String s ;
        if (firstNumber % 2 == 0 ){
            System.out.printf("your number  : %.2f is Even number.\n" ,firstNumber);
        }else {
            System.out.printf("your number  : %.2f is Odd number.\n" ,firstNumber);
        }
        System.out.println("\nDo you want to continue? [Y/N]");
        s = scan.next();
        again(s);
    }
public static void  again(String s){
    switch (s){
        case "Y":
        case "y":
        case "Yes":
        case "yes":
            start();
            break;
        case "N":
        case "n":
        case "No":
        case "no":
            System.out.println(" Good Bye :)");
            System.exit(0);

        default:
//            JOptionPane.showMessageDialog(null,"Your words aren't True!! :(","Error System",JOptionPane.ERROR_MESSAGE); It's not working
            System.out.println("Your word isn't true!! :(");
            scan.nextLine();
            start();

            break;


    }
}
    public static void main(String[] args) {
        start();
    }
}
