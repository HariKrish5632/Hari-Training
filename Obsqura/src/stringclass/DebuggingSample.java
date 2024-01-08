package stringclass;

public class DebuggingSample {
	
	int a = 10;
	int b = 20;
	
	public void add() {
		System.out.println(a+b);
	}
	public void sub() {
		System.out.println(a-b);
	}
	public void mul() {
		System.out.println(a*b);
	}
	public static void main(String[] args) {
		DebuggingSample ob = new DebuggingSample();
		ob.add();
		ob.sub();
		ob.mul();
	}
}
