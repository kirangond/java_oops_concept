package variables;

//static variable belongs to class and accessed by using classname.variablename
//non static variable belongs to object and access using only objects
//static value can be changed
//static variable only a single copy created  and value will be same through out the program
//non static multiple copies
//just dummy changes
public class A {
//default static value
	static int j;
	int k;
	public static void main(String[] args) {
		
		System.out.println(A.j);
		j=5;
		System.out.println("j: "+j);
		//System.out.println(A.k); //Cannot make a static reference to the non-static field A.k
       A a = new A();
       System.out.println(a.k); // Cannot make a static reference to the non-static field k (If I'm trying to access variable without creating object)
       A a1 = new A();
       a1.k=10;
       System.out.println(a1.k);
       System.out.println(a.k);
	}

}
