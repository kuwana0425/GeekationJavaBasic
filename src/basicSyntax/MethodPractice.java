package basicSyntax;
public class MethodPractice {
	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		
		int result1 = add(a, b);
		int result2 = sub(a, b);
		int result3 = mult(a, b);
		int result4 = div(a, b);
		
		printAllPrice(a, result1,result2,result3,result4);
		}
	public static int add(int a, int b) {
		return a + b;
		}
	public static int sub(int a, int b) {
		return a - b;
		}
	public static int mult(int a, int b) {
		return a * b;
		}
	public static int div(int a, int b) {
		return a / b;
		}
	public static void printAllPrice(int a, int result1,int result2,int result3,int result4) {
		System.out.println("計算結果は " + result1 + "です。");
		System.out.println("計算結果は " + result2 + "です。");
		System.out.println("計算結果は " + result3 + "です。");
		System.out.println("計算結果は " + result4 + "です。");
	}
}