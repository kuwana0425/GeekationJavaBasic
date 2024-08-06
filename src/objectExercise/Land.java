package objectExercise;

public class Land extends Property{
	private double LandSize;
	
	Land(String PropertyName,String OwnerName, String PropertyType, int PropertyPrice,double LandSize) {
		super(PropertyName,OwnerName,PropertyType,PropertyPrice);
		this.LandSize = LandSize;
		}
	public void greeting() {
		super.greeting();
		System.out.println("広さ：" + this.LandSize +"㎡");
		System.out.println("=============================");
	}
}