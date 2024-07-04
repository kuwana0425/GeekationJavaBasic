package basicSyntax;

public class MethodPractice {
	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		
		System.out.println("計算結果は" + calculation(a, b, 0)+"です。");
		System.out.println("計算結果は" + calculation(a, b, 1)+"です。");
		System.out.println("計算結果は" + calculation(a, b, 2)+"です。");
		System.out.println("計算結果は" + calculation(a, b, 3)+"です。");
    }
	public static int calculation(int value1, int value2, int type) {
		
		int result = 0;
		switch(type) {
		
		case 0:
			result = value1 + value2;
			break;
			
		case 1:
			result = value1 - value2;
			break;
			
		case 2:
			result = value1 * value2;
			break;
			
		case 3:
			result = value1 / value2;
			break;
		}
		return result;
	}
}