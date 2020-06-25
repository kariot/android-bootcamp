
public class Teacher {

	private String designation;
	private String collegeName;
	
	public Teacher(String designation,String collegeName) {
		this.designation = designation;
		this.collegeName = collegeName;
	}
	
	public void whatTeacherDoes() {
	 System.out.println("Designation : "+designation);
	 System.out.println("College Name :"+collegeName);
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}	
	
}
