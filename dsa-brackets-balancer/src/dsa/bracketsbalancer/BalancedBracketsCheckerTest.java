package dsa.bracketsbalancer;
import java.util.Scanner;

public class BalancedBracketsCheckerTest {
	
	public static void main(String[] args) {
		
		Scanner input;
		input = new Scanner(System.in);
		System.out.println("Enter the expression: "); 
		String bracketsExpression = input.next();
		//String bracketsExpression = "(([{}]))";
		Boolean result = testBalancedBracketsChecker(
			bracketsExpression);
		System.out.println(result);
	}

	static Boolean testBalancedBracketsChecker(
			String bracketsExpression) {
				
		BalancedBracketsChecker checker 
			= new BalancedBracketsChecker(bracketsExpression);
		
		return checker.check();
	}	


}
