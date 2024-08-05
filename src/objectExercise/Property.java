package objectExercise;

public class Property {
	protected String PropertyName;
	protected String OwnerName;
	protected String PropertyType;
	protected int PropertyPrice;
	
	Property(String PropertyName,String OwnerName, String PropertyType, int PropertyPrice) {
	  this.PropertyName = PropertyName;
	  this.OwnerName = OwnerName;
	  this.PropertyType = PropertyType;
	  this.PropertyPrice =PropertyPrice;
	  }
	
	public String getPropertyName() {
	  return this.PropertyName;
	  }
	public String getOwnerName() {
	  return this.OwnerName;
	  }
	public String getPropertyType() {
	  return this.PropertyType;
	  }
	public int getPropertyPrice() {
	  return this.PropertyPrice;
	  }
	public void setpropertyname(String PropertyName) {
	  this.PropertyName = PropertyName;
	  }
	public void setOwnerName(String OwnerName) {
	  this.OwnerName = OwnerName;
	  }
	public void setPropertyType(String PropertyType) {
	  this.PropertyType = PropertyType;
	  }
	public void setPropertyPrice(int PropertyPrice) {
	  this.PropertyPrice = PropertyPrice;
	  }
	public void greeting() {
		System.out.println("=============================");
		System.out.println("物件名："+ this.PropertyName);
		System.out.println("物件所有者名："+ this.OwnerName);
		System.out.println("物件種別："+ this.PropertyType);
		System.out.println("物件価格："+this.PropertyPrice +"円");
	}
}