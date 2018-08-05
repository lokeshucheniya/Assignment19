
//Class InvalidInputException for throwing userdefine exception
class InvalidInputException extends Exception{
	public InvalidInputException(String message) {
		super(message);
	}
}

//Class FactorialException for throwing userdefine exception
class FactorialException extends Exception{
	public FactorialException(String message) {
		super(message);
	}
}

//Class Factorial for calculating factorial of given number
public class Factorial {
	int getfactorial(int n) throws Exception {
		long fact = 1;
		if(n==0 || n==1 || n<0) {						//Checking conditions
			throw new InvalidInputException ("Number is less than 2");
		}
		for(int i=1;i<=n;++i) {							//Factorial logic
			fact=fact*i; 
		}
		if(fact > (-2147483648)) {						//For calculating range of int
			throw new FactorialException ("Number exceeds integer limit");
		}
		return (int)fact;
	}
}
