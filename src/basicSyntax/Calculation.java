package basicSyntax;

public class Calculation {

	public static void main(String[] args) {
		String variable = "変数";
		String value = "の値は";
		String verb ="です";
		
		int x= 5;
		int y = 10;
		int z = x + y;
		int b = 23;
		
		double a = 5.25;
		double c = 2.5;
		double d = 3.0;
		
		a = (a + c)*d;
		b = (b + y);
		
		System.out.println( variable + "z" + value +(int)z + verb);
		System.out.println( variable + "a" + value + a + verb);
		System.out.println( variable + "b" + value + b + verb);
	}
}
