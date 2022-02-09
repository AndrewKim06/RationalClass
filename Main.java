import java.util.Scanner;

class Main {
  public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
    int numerator;
    int denominator;
		System.out.print("Enter the numerator ----> ");		
		numerator = scanner.nextInt();
		System.out.print("Enter the denominator --> ");
    denominator = scanner.nextInt();

		if (denominator != 0 && numerator != 0){
			Fraction first = new Fraction(numerator, denominator);
			System.out.println(first.toString());
		}
  }
}