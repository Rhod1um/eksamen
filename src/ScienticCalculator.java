public class ScienticCalculator extends Calculator{

  ScienticCalculator(int numberA, int numberB){
    super(numberA, numberB);
  }

  public void calculate(char regneart){
    super.calculate(regneart);
    if (regneart == 's'){
      sr(getNumberA());
    }
  }

  public void sr(int numberA){
    setResult( Math.sqrt(getNumberA()));
  }

}
