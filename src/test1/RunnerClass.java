package test1;

public class RunnerClass {
	public static void main(String args[])
	{
		ChildClass objChild = new ChildClass();
		//ParentClass objParent = new ParentClass();

		GrandChild objGRChild = new GrandChild();
		objChild.show();
		objChild.display();
		objGRChild.display();
		}

}
