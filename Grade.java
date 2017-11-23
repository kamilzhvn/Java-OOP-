
public enum Grade {

	A_MINUS, A, B_PLUS, B, B_MINUS, C_PLUS, C, C_MINUS, D_PLUS, D, F;
	private String grade;
	
	private Grade(String grade) {
	    this.grade = grade;
	}
	
	public String getGrade() {
	    return grade;
	}
	
	
 }
