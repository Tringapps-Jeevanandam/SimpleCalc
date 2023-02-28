package simplecalc;

class Division extends Operation {
    public Division(double num1, double num2) {
      super(num1, num2);
    }
  
    public double calculate() {
      return getNum1() / getNum2();
    }
  }