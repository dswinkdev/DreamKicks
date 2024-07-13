
public class Shoe {
	
	private int id;
	
	String brand;
	String type;
	String color;

	int yearOfRelease;
	double size;
	boolean inStock;
	
	// constructor
	Shoe(){
	}
	
	public Shoe(String brand, String type, String color, int id, int yearOfRelease, double size, boolean inStock) {
		
		this.brand = brand;
		this.type = type;
		this.color = color;
		this.id = id;
		this.yearOfRelease = yearOfRelease;
		this.size = size;
		this.inStock = inStock;
		
		
	}
	
	
	  // Setter
	  public void setID(int id) {
	    this.id = id;
	  }
	  
	  // Getter
	  public int getID() {
	    return id;
	  }

	 
	
}
