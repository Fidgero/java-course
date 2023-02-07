import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Calc");
        int int_a = 0;
        int int_b = 0;

        while (true){
            while(true) {
                System.out.println("Enter first number");
                String a = scan.nextLine();
                try {
                    int_a = Integer.parseInt(a);
                    break;
                } catch (NumberFormatException ex) {
                    System.out.println("you need NUMBER");
                }
            }

            while(true) {
                System.out.println("Enter second number");
                String b = scan.nextLine();
                try {
                    int_b = Integer.parseInt(b);
                    break;
                } catch (NumberFormatException ex) {
                    System.out.println("you need NUMBER");
                }
            }
            while(true) {
                System.out.println("Enter operation: plus, minus, multiply, devided");
                String op = scan.nextLine();
                switch (op) {
                    case "plus":
                        int plus = int_a+int_b;
                        System.out.println(plus);
                        break;
                    case "minus":
                        int minus = int_a-int_b;
                        System.out.println(minus);
                        break;
                    case "multiply":
                        int multiply = int_a*int_b;
                        System.out.println(multiply);
                        break;
                    case "devided":
                        int devided = int_a/int_b;
                        System.out.println(devided);
                        break;
                    default:
                        System.out.println("try again");
                        break;
                }
            }
        }
    }
}
