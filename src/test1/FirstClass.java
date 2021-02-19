package test1;

public class FirstClass {
	int age;
	String Name;
	float  Salary;
	
	public void Display() {
		
		System.out.println("Inside display");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("hello world ");
			SecondClass Obj1 = new SecondClass();
			Obj1.Show("Rahul");
			SecondClass Obj2 = new SecondClass();
			Obj2.Show("Ajay");
			Obj1.calculate("Arjun");
			
	}

}
