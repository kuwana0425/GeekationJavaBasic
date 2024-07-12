package basicSyntax;
public class MethodPractice {
	public static void main(String[] args) {
		int result1 = add(10,5);
		int result2 = sub(10,5);
		int result3 = mult(10,5);
		int result4 = div(10,5);
		
		calculation(result1);
		calculation(result2);
		calculation(result3);
		calculation(result4);
	}
	public static int add(int a, int b) {
		int result = a + b;
		return  result;
		}
	public static int sub(int a, int b) {
		int result = a - b;
		return result;
		}
	public static int mult(int a, int b) {
		int result = a * b;
		return result;
		}
	public static int div(int a, int b) {
		int result =a / b;
		return result;
		}
	public static void calculation(int result) {
		System.out.println("計算結果は " + result + "です。");
	}
}