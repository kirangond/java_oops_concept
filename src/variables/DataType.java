package variables;

public class DataType {
	//we can't use keyword/data type as variable name
	
	int k;
	
	static short s;
	static float f;
	static char c;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//we get error as we won't able to store into byte we can use type casting to resolve error but down casting may leads to data loss
//		byte b = 1000 ;
//		System.out.println("b: " + b);
		DataType d = new DataType();
		System.out.println("default value for k: " + d.k);
		
		System.out.println("default value for s: " + s);
		
		System.out.println("default value for f: " + f);
		System.out.println("default value for char c: " + c + " :can't see empty");
		
		long l = 1234l;
		
//		 int int = 10;
//		System.out.println(int);
		
		int var = 2;

	}

}
