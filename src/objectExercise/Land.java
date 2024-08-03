package objectExercise;

public class Land extends Property{
	private double size;
	
	Land(String Propertyname,String name, String Propertytype, int price,double size) {
		super(Propertyname,name,Propertytype,price);
		this.size = size;
		}
	public void greeting() {
		super.greeting();
		System.out.println("広さ：" + this.size +"㎡");
	}
}