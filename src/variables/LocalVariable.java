package variables;

public class LocalVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalVariable obj = new LocalVariable();
		obj.add();
		obj.sum();
		obj.diff(5,4);
		obj.mul(2,3);
		
		
	}

	private void mul(int i, int j) {
		// TODO Auto-generated method stub
		//int i = 10; // duplicate local variable we will get error
		System.out.println("i: " + i);
		System.out.println("i will update: " + i*3);
		i = i*4; //it got updated
		int result = i * j;
		System.out.println(result);
	}

	private void diff(int i, int j) {
		// TODO Auto-generated method stub
		int c = i-j;
		System.out.println("diff c is: " + c);
		
	//	int i=2; // duplicate var as we can't use local variable as same as argument variable
		
	}

	private void sum() {
		// TODO Auto-generated method stub
		int a = 5;
		System.out.println("a value of sum method: " + a);
		return;
		
	}

	private void add() {
		// TODO Auto-generated method stub
		int a = 5;
		System.out.println("a value: " + a);
	}

}
