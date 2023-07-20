package defaults;

public class MultipleIneritanceExample implements  InterfaceA, InterfaceD
{

	public static void main(String[] args) 
	{
		MultipleIneritanceExample ineritanceExample=new MultipleIneritanceExample();
		
		ineritanceExample.sumA(4,8);  // resolve to child
		
			

	}

	@Override
	public void sumA(int num1, int num2) {
		// TODO Auto-generated method stub
		InterfaceA.super.sumA(num1, num2);
	}


}
