import java.util.Scanner;

class Main {
  public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the 1st numerator ----> ");		
		int firstNumerator = scanner.nextInt();
		System.out.print("Enter the 1st denominator --> ");
    int firstDenominator = scanner.nextInt();
    
    System.out.print("Enter the 2nd numerator ----> ");		
		int secondNumerator = scanner.nextInt();
		System.out.print("Enter the 2nd denominator --> ");
    int secondDenominator = scanner.nextInt();

		Fraction f1 = new Fraction(firstNumerator, firstDenominator);
    Fraction f2 = new Fraction(secondNumerator, secondDenominator);
		System.out.println("Add: " + Operations.add(f1, f2));
		System.out.println("Multiply: " + Operations.multiply(f1, f2));
		System.out.println("Subtract: " + Operations.subtract(f1, f2));
		System.out.println("Divide: " + Operations.divide(f1, f2));
    System.out.println("Subtract: " + Operations.subtract(f1, f2));
  }
}