import java.util.Scanner;

public class Calculator {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.print("Enter the first number: ");
      double num1 = scanner.nextDouble();
      System.out.print("Enter the operation (+, -, *, /): ");
      char operator = scanner.next().charAt(0);
      System.out.print("Enter the second number: ");
      double num2 = scanner.nextDouble();
      scanner.close();
      double result;

      switch(operator) {
         case '+':
            result = num1 + num2;
            break;
         case '-':
            result = num1 - num2;
            break;
         case '*':
            result = num1 * num2;
            break;
         case '/':
            result = num1 / num2;
            break;
         default:
            System.out.println("Invalid operation.");
            return;
      }

      System.out.println(num1+" "+operator+" "+num2+": "+result);
   }
}
