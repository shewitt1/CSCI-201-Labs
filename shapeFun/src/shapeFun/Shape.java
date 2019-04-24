package shapeFun;

public class Shape {
	public int id;
	public String name;
	
	public int getId() {
		return id;
		
	}
	
	public String getName() {
		return name;
	}
	
	public String setName() {
		return name;
	}
	
	public Shape (int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public String toString() {
		return String.format("Shape %d: %s",
				id, name);
	}
	
	
}
