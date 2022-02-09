public class Fraction
{

  private int numerator;
  private int denominator;
  public Fraction(int numerator, int denominator){
    this.numerator = numerator;
    this.denominator = denominator;
  }
  public void setNumerator(int x) {
        numerator = x;
    }
    
  public void setDenominator(int x) {
        denominator = x;
    }
	public String getRational(){
		return numerator + "/" + denominator;
	}
  
  public double getDecimal(){
    double decimal = (double)numerator / (double)denominator;

		return Math.round(decimal * 100.0) / 100.0;
  }

  public int getGCF(){
		int gcd = 0;
    for(int i = 1; i <= numerator && i <= denominator; i++)
      {
        if(numerator % i == 0 && denominator % i ==0){					
					gcd = i;
				}
      }
			return gcd;
  }
	public String simplified(){
		int gcf = getGCF();
		numerator /= gcf;
		denominator /= gcf;
		return numerator + "/" + denominator;
	}

  public String toString(){
    return getRational() + " equals " + getDecimal() + "\nand reduces to " + simplified();
  }
}