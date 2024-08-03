package objectExercise;

public class Main {
	public static void main(String[] args) {
		Apartment apartment = new Apartment("良い感じアパートメント","山田マンション太郎","マンション",50000000,"3LDK");
		System.out.println("=============================");
		System.out.println("物件名："+ apartment.getpropertyname());
		System.out.println("物件所有者名："+ apartment.getname());
		System.out.println("物件種別："+ apartment.getpropertytype());
		System.out.println("物件価格："+ apartment.getprice()+"円");
		apartment.greeting();
		System.out.println("=============================");
		
		Land land = new Land("良い感じの土地","山田　土地太郎", "土地",8000000,105.2);
		System.out.println("=============================");
		System.out.println("物件名："+ land.getpropertyname());
		System.out.println("物件所有者名："+ land.getname());
		System.out.println("物件種別："+ land.getpropertytype());
		System.out.println("物件価格："+ land.getprice()+"円");
		land.greeting();
		System.out.println("=============================");
	}
}