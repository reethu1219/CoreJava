package test1;

public class Looping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=5;
		
		while(i<5) {
			System.out.println("Value of i" +i);
			i=i+1;
		}
		int j=5;
		do {
			System.out.println("value of j " +j);
			j=j+1;
			
		}while(j<5);
		
		for(int k=5;k<5;k++) {
			System.out.println("Value of k" +k);
		}
		int arr[]= {12,23,44,56,78};
		for(int l:arr)
		{
			System.out.println(l);
		}

	}

}
