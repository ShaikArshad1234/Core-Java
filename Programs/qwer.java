package yusuf;
class  L {
	int i=100;
	void m1() {
		int i=55;
		System.out.println(i);
		System.out.println(this.i);
	}
}
class Hu {
public static void main(String[] args) {
	L a1 = new L();
	a1.m1();
}
}

