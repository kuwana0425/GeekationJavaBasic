package basicSyntax;

public class MethodPractice {

	public static void main(String[] args) {
		int a, b;
		
		a = 10;
		b = 8;
		add(a, b);
		sub(a,b);
		mult(a,b);
		div(a,b);
	}
	static void add(int a, int b) {
		System.out.println("計算結果は"+(a+b)+"です。");
	}
	static void sub(int a, int b) {
		System.out.println("計算結果は"+(a-b)+"です。");
	}
	static void mult(int a, int b) {
		System.out.println("計算結果は"+(a*b)+"です。");
	}
	static void div(int a, int b) {
		System.out.println("計算結果は"+(a/b)+"です。");
	}
}