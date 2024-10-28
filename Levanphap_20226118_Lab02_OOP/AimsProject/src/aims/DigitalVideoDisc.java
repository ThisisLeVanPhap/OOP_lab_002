package aims;

public class DigitalVideoDisc {

	private String title;
	private String category;
	private String director;
	private double cost;
	private int length;
	
	//constructor method
	public DigitalVideoDisc(String title) {
		super();
	    this.title = title;
	}

	public DigitalVideoDisc(String title, String category, double cost) {
	    this.title = title;
	    this.category = category;
	    this.cost = cost;
	}

	public DigitalVideoDisc(String title, String category, String director, double cost) {
	    this.title = title;
	    this.category = category;
	    this.director = director;
	    this.cost = cost;
	}

	public DigitalVideoDisc(String title, String category, String director, int length, double cost) {
	    this.title = title;
	    this.category = category;
	    this.director = director;
	    this.length = length;
	    this.cost = cost;
	}
	
	// getter
	public String getTitle() {
	    return title;
	}

	public String getCategory() {
	    return category;
	}

	public String getDirector() {
	    return director;
	}

	public int getLength() {
	    return length;
	}

	public double getCost() {
	    return cost;
	}
}
