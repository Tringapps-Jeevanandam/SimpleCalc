package com.example;

import java.util.Scanner;
import java.util.logging.Logger;

abstract class Operation {
  private double num1;
  private double num2;

  protected Operation(double num1, double num2) {
    this.setNum1(num1);
    this.setNum2(num2);
  }

  public double getNum1() {
    return num1;
  }

  public void setNum1(double num1) {
    this.num1 = num1;
  }

  public double getNum2() {
    return num2;
  }

  public void setNum2(double num2) {
    this.num2 = num2;
  }

  public abstract double calculate();
}

class Addition extends Operation {
  public Addition(double num1, double num2) {
    super(num1, num2);
  }

  public double calculate() {
    return getNum1() + getNum2();
  }
}

class Subtraction extends Operation {
  public Subtraction(double num1, double num2) {
    super(num1, num2);
  }

  public double calculate() {
    return getNum1() - getNum2();
  }
}

class Multiplication extends Operation {
  public Multiplication(double num1, double num2) {
    super(num1, num2);
  }

  public double calculate() {
    return getNum1() * getNum2();
  }
}

class Division extends Operation {
  public Division(double num1, double num2) {
    super(num1, num2);
  }

  public double calculate() {
    return getNum1() / getNum2();
  }
}


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
            case "":
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
  
  
