package variables;

public class DeclareStatic {
     static int i;//If we declare static var without initilisation it will not give error
	int k=5; // until and unless you will not create object of class u will not able to access var
    int m; 
	public static void main(String[] args) {
		System.out.println("kiran"); 
        System.out.println(DeclareStatic.i);
        DeclareStatic a =  new DeclareStatic();
        System.out.println(a.k);
        System.out.println(a.m);
	} 
	static int j;//we need to declare outside main method & anywhere in the program
	//System.out.println("kiran");//we can't print anything outside the main method
}
