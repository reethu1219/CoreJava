package test1;

public class ThrowsExample {
	public static void main(String []args) {
		try {
		int age=11;
		if(age<18)
		{
			throw new ArithmeticException("not valid");
		}
		else
		{
			System.out.println("welcomde to vote");
	    }	
	}
		catch(ArithmeticException e) {
			System.out.println("Exception Handled");
		}
			
	}

}
