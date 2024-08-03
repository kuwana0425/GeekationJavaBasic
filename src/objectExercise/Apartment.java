package objectExercise;

public class Apartment extends Property {
	protected String floorsize;
	
	Apartment(String propertyname,String name, String propertytype, int price,String floorsize) {
		super(propertyname,name, propertytype,price);
		this.floorsize = floorsize;
	}
	public void greeting() {
		super.greeting();
		System.out.println("間取り：" + this.floorsize);
	}
}