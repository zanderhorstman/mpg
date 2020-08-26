import java.util.Scanner;

public class mpg {
    public static void main(String[] args) {

        //Enter traveled miles:
        //750
        //Enter gallons:
        //3
        //
        //The result is 250.0 miles/gallon
        Scanner keybd = new Scanner(System.in);
        System.out.print("Please enter miles traveled as a whole number: ");
        int miles = keybd.nextInt();

        System.out.print("Please enter gallons of fuel as a whole number: ");
        double gallons = keybd.nextDouble();

        System.out.println("The result is " + miles / gallons);

    }
}
