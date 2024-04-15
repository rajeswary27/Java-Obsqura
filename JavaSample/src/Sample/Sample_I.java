     package Sample;

public class Sample_I {
	
	
	public static void add() {//public
		
		int a=7;
		int b=5;
		int c=a+b;
		System.out.println(c);
		
		
	}
	
private static void sub() {//public
		
		int a=7;
		int b=5;
		int c=a-b;
		System.out.println(c);
		
		
	}

protected static void multi() {//protected
	
	int a=7;
	int b=5;
	int c=a*b;
	System.out.println(c);
	
	
}

 static void div() {//void
	
	int a=7;
	int b=5;
	int c=a+b;
	System.out.println(c);
	
	
}

	public static void main(String[] args) {
		
		
		
		Sample_I ob=new Sample_I();
		Sample_I.add();
		Sample_I.sub();
		Sample_I.multi();
		Sample_I.div();


	}

}
