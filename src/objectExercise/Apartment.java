package objectExercise;

public class Apartment extends Property {
	protected String FloorSize;
	
	Apartment(String PropertyName,String OwnerName, String PropertyType, int PropertyPrice,String FloorSize) {
		super(PropertyName,OwnerName, PropertyType,PropertyPrice);
		this.FloorSize = FloorSize;
	}
	public void greeting() {
		super.greeting();
		System.out.println("間取り：" + this.FloorSize);
		System.out.println("=============================");
	}
}