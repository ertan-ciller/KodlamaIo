package kodlamaIo.entities;

public class Instructor {
	
	private int instructorId;
	private String name;
	
	public Instructor(int instructorId, String name) {
		super();
		this.instructorId = instructorId;
		this.name = name;
	}
	
	public int getInstructorId() {
		return instructorId;
	}
	public void setInstructorId(int instructorId) {
		this.instructorId = instructorId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Instructor() {

	}
	
	

}
