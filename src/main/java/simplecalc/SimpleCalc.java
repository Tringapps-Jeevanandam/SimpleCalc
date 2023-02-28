package simplecalc;

import java.util.*;
import java.util.logging.Logger;

public class SimpleCalc {
    public static final Logger Log = Logger.getLogger("InfoLogging");
  
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      Log.info("Enter first number: ");
      double num1 = sc.nextDouble();
      double result = num1;
      boolean flag = true;
  
      do {
        Log.info("Enter operation (+, -, , /, exit[press 1]): ");
        String operation = sc.next();
  
        if (operation.equals("1")) {
          flag = false;
        } else {
          Log.info("Enter second number: ");
          double num2 = sc.nextDouble();
          Operation calculator;
  
          switch (operation) {
            case "+":
              calculator = new Addition(result, num2);
              break;
            case "-":
              calculator = new Subtraction(result, num2);
              break;
            case "*":
              calculator = new Multiplication(result, num2);
              break;
            case "/":
              calculator = new Division(result, num2);
              break;
            default:
              Log.info("Invalid operator");
              continue;
          }
          result = calculator.calculate();
          String res = Double.toString(result);
          Log.info(res);
  
        }
      } while (flag);
  
    }
  }
  