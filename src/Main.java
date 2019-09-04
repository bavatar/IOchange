import java.util.Scanner;
//Input/Output Change Assignment
//        This application takes 2 integer values and finds the largest
//        one. Change the application so that it finds the average of
//        two double values.

public class Main {
    public static void main( String[] args )
    {
        Scanner keyboard = new Scanner(System.in);

        int num1, num2, num3;

        System.out.print( "First Number" );
        num1 = keyboard.nextInt();

        System.out.print( "Second Number" );
        num2 = keyboard.nextInt();

        num3 = num1 + num2;

        System.out.println("The average value is : " + num3/2);
    }
}
