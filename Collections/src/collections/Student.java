package collections;

public class Student implements Comparable<Student> {
	private int id;
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "The user id is: [" + id + "] and the name is: [" + name + "]";
	}

	@Override
	public int compareTo(Student that) {
		return Integer.compare(that.id, this.id);
	}

}
