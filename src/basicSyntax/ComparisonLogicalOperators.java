package basicSyntax;

public class ComparisonLogicalOperators {

	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		int x = 5;
		int y = 8;
		
		boolean isSunny  = true;
		boolean isWarm = true;
		boolean hasPermission = false;
		
		boolean isGreaterA = (a > b);
		boolean isGreaterB = (isSunny && isWarm);
		boolean isGreaterC = ( x > 0 && ( y % 2 ) == 0 );
		boolean isGreaterD = (hasPermission =true);
				
		System.out.println(isGreaterA);
		System.out.println(isGreaterB);
		System.out.println(isGreaterC);
		System.out.println(isGreaterD);
	}
}