package test1;

public class PrimeNum {
	public static void main(String[] args) {

	int n=51;
	int count=0;
	for(int i=n;i>0;i--) {
		if(n%i==0)
		{
			count++;
		}
		
	}
	if(count==2)
	{
		System.out.println("number is prime");
	}
	else {
		System.out.println("Num is not prime");
	}
}

}
