package clone;

public class person implements Cloneable{
	int id;
	String name;
	public person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}
