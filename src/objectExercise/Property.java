package objectExercise;

public class Property {
	protected String propertyname;
	protected String name;
	protected String propertytype;
	protected int price;
	
	Property(String propertyname,String name, String propertytype, int price) {
	  this.propertyname = propertyname;
	  this.name = name;
	  this.propertytype = propertytype;
	  this.price =price;
	  }
	
	public String getpropertyname() {
	  return this.propertyname;
	  }
	public String getname() {
	  return this.name;
	  }
	public String getpropertytype() {
	  return this.propertytype;
	  }
	public int getprice() {
	  return this.price;
	  }
	public void setpropertyname(String propertyname) {
	  this.propertyname = propertyname;
	  }
	public void setname(String name) {
	  this.name = name;
	  }
	public void setpropertytype(String propertytype) {
	  this.propertytype = propertytype;
	  }
	public void setprice(int price) {
	  this.price = price;
	  }
	public void greeting() {
	}
}