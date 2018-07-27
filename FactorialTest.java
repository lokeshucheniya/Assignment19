import java.util.Scanner;

public class FactorialTest {
	public static void main(String args[]) {
		Scanner src = new Scanner(System.in);
		int n = src.nextInt();
	
		Factorial factorial = new Factorial();
		
		try{
			int a = factorial.getfactorial(n);
			System.out.println(a);
			
		}catch(InvalidInputException e) {
			e.printStackTrace();
			
		}catch(FactorialException e) {
			e.printStackTrace();
			
		}catch (Exception e) {
			e.printStackTrace();
		}

		src.close();
	}
}
