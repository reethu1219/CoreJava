package test1;

import java.io.IOException;

public class ThrowExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThrowExample obj= new ThrowExample();
		try {
			obj.a1();
		}catch(IOException e) {
			System.out.println("Exception occurred");
		}
	}
	public void a1() throws IOException{
		int age =11 ;
		if(age<18) {
			throw new IOException("not valid");
			
		}
		else {
			System.out.println("welcome to vote");
		}
	}
}
