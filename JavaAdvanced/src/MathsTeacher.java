
public class MathsTeacher extends Teacher{
	
	public MathsTeacher(String designation, String collegeName,String mainSubject) {
		super(designation, collegeName);
		this.mainSubject = mainSubject;
	}

	String mainSubject = "Maths";
	
	public static void main(String[] args) {
		
		MathsTeacher t1 = new MathsTeacher("Teacher","AKNM GPTC","Maths");
		t1.setCollegeName("Some Fake College");
		t1.setDesignation("Fake Designation"); 
		t1.whatTeacherDoes();
	}
	
	@Override
	public void whatTeacherDoes() {
		super.whatTeacherDoes();
		System.out.println("Main Subject : "+mainSubject);
	}
}
