package objectExercise;

public class Main {
	public static void main(String[] args) {
		Apartment apartment = new Apartment("良い感じアパートメント","山田マンション太郎","マンション",50000000,"3LDK");
		apartment.greeting();
		
		Land land = new Land("良い感じの土地","山田　土地太郎", "土地",8000000,105.2);
		land.greeting();
	}
}