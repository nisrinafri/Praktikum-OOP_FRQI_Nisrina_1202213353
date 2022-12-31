import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Calculation calculation = new Calculation();

        boolean repeat = false;
        // boolean repeat = true;
        // boolean report = false;

        Thread th1 = new Thread(calculation);

        Scanner ScannerNew = new Scanner(System.in);

        do {
            System.out.println("=== Menu Program ===");
            System.out.println("1. Square");
            System.out.println("2. Circle");
            System.out.println("3. Trapezoid");
            System.out.print("Select menu: ");

            int calc = ScannerNew.nextInt();
            try {
                switch (calc) {
                    case 1:
                        System.out.println("");
                        System.out.print("Enter the length of the side of the square: ");
                        calculation.side = ScannerNew.nextDouble();
                        calculation.setSquare();
                        th1.start();
                        th1.join();
                        System.out.println("\nThe calculation result: " + calculation.getSquare());
                        break;

                    case 2:
                        System.out.println("");
                        System.out.print("Enter the radius of the circle: ");
                        calculation.radius = ScannerNew.nextDouble();
                        calculation.setCircle(calculation.radius);
                        th1.start();
                        th1.join();
                        System.out.println("\nThe calculation result: " + calculation.getCircle());
                        break;

                    case 3:
                        System.out.println("");
                        System.out.print("Input the side of the base of the trapezoid: ");
                        double a = ScannerNew.nextDouble();
                        System.out.print("Enter the upper side of the trapezoid: ");
                        double b = ScannerNew.nextDouble();
                        System.out.print("Enter height of the trapezoid: ");
                        double t = ScannerNew.nextDouble();
                        calculation.setTrapezoid(a, b, t);
                        th1.start();
                        th1.join();

                        System.out.println("\nThe calculation result: " + calculation.getTrapezoid());
                        break;

                    case 0:
                        System.out.println("Program Finished");
                        break;

                    default:
                        System.out.println("Option not Available");
                        break;
                }
            } catch (InputMismatchException a) {
                System.out.println("Input must be a number");

            } catch (IllegalArgumentException e) {
                System.out.println("java.lang.IllegalArgumentException");
            }
        } while (repeat);
        ScannerNew.close();

    }
}