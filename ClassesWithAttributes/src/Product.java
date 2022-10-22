
public class Product {

	// aşağıdakiler attribute yada field olarak adlandırılır.
	
	private int id;
	private String name;
	private String description;
	private double price;
	private int staockAmount;
	String kod;

	
	
	
	
	//getter
	public int getId() {
		return id;
	}
	//setter
	public void setId(int id) {
		this.id = id;
	}

	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	
	
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	
	
	
	public int getStaockAmount() {
		return staockAmount;
	}
	public void setStaockAmount(int staockAmount) {
		this.staockAmount = staockAmount;
	}

	
	public String getKod() {
		return this.name.substring(0,2) + id;
	}
	







	

}
