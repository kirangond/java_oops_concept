package variables;

public class LocalVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalVariable obj = new LocalVariable();
		obj.add();
		obj.sum();
		obj.diff(5,4);
		
		
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
		
	}

	private void add() {
		// TODO Auto-generated method stub
		int a = 5;
		System.out.println("a value: " + a);
	}

}
