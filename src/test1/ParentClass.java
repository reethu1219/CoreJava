package test1;

public abstract class ParentClass {
	int EmpNo =101;
	public void display()  //try for private and protected
	{
		System.out.println("emp no:" +EmpNo);
	}
	abstract void run();
	abstract void horn();
	abstract void safety();

}
