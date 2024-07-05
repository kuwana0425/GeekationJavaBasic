package basicSyntax;
public class MethodPractice {
	public static void main(String[] args) {
	int result1 =add(10,5);
	int result2 =sub(10,5);
	int result3 =mult(10,5);
	int result4 =div(10,5);
	
	System.out.println("計算結果は"+result1+"です。");
	System.out.println("計算結果は"+result2+"です。");
	System.out.println("計算結果は"+result3+"です。");
	System.out.println("計算結果は"+result4+"です。");
}
	private static int add(int a, int b) {
		int x = a + b;
		
		return x;
	}
	
	private static int sub(int a, int b) {
		int x = a - b;
		
		return x;
	}
	
	private static int mult(int a, int b) {
		int x = a * b;
		
		return x;
	}
	
	private static int div(int a, int b) {
		int x = a / b;
		
		return x;
	}
}