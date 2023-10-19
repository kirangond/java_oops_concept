package variables;

//static var and local var name same? Yes

public class StaticVsNonStatic {
    static int i=10;
	public static void main(String[] args) {
	 int i= 5;
	 StaticVsNonStatic a = new StaticVsNonStatic();
	 System.out.println(StaticVsNonStatic.i);
	 System.out.println(i);

	}

}
