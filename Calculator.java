package Assign1;

public class Calculator {
	public int add() {
		int a=12;
		int b=13;
		int c=a+b;
		System.out.println(c);
		return c;
}   public void sub() {
			int e=20;
			int f=07;
			int g=e-f;
			System.out.println(g);
}    public void multiple() {
	      double i=10;
	      double j=5;
	      double k=i*j;
	      System.out.println(k);
}    public void divide() {
       	float x=120;
	    float y=6;
	    float z=x/y;
	    System.out.println(z);
}

public static void main(String[] args) {
	Calculator mycal=new Calculator();
	    mycal.add();
		mycal.sub();
		mycal.multiple();
	    mycal.divide();

	}

}
