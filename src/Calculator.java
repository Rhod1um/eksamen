public class Calculator {
  private int numberA, numberB;
  private double result;

  Calculator(int numberA, int numberB){
    this.numberA=numberA;
    this.numberB=numberB;
  }

  public void calculate(char regneart){
    switch (regneart){
      case '+' -> {
        result = numberA + numberB;
      }
      case '-' -> result = numberA - numberB;
      case '/' -> result = (double) numberA / numberB;
      case '*' -> result = numberA*numberB;
    }
  }

  public int getNumberA(){
    return numberA;
  }

  public void setResult(double result){
    this.result=result;
  }

}
