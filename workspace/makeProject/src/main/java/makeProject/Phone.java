package makeProject;

public class Phone {
	
	private String [] name;
	private int price;
	private String[] brand;
	
	public Phone(String[] name, int price, String[] brand) {
		super();
		this.name = name;
		this.price = price;
		this.brand = brand;
	}

	public String[] getName() {
		return name;
	}

	public void setName(String[] name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String[] getBrand() {
		return brand;
	}

	public void setBrand(String[] brand) {
		this.brand = brand;
	}
	
	
}
