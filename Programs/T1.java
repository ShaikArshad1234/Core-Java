package yusuf;
class  A {
	int i=100;
	void m1() {
		int i=55;
		System.out.println(i);
		System.out.println(this.i);
	}
}

public class T1 {
	public static void main(String[] args) {
	A a1 = new A();
	  int i=100;
	a1.m1();
		System.out.println(i);
}
}



