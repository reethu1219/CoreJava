package test1;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		int i=0;
		int j =10/i;
		System.out.println("hi ravi");
		}
		catch(ArithmeticException e) {
			System.out.println("we can't divide any number by zero");
		}
		catch(Exception e) {
			System.out.println("exception occurred");
		}
		System.out.println("after exception");

	}

}
