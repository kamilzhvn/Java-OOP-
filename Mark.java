import java.lang.*;
import java.util.Vector;


public class Mark {
    private String course;
    private Student student;
    private Grade grade;
    private int mark;
   
    public String getCourse() {
        return course;
    }

 
    public Student getStudent() {
        return student;
    }
    

    
    public static Grade getGrade (int mark) {
		if( mark<=50) return Grade.F;
		else if( mark <=55) return Grade.D;
		else if( mark <=60) return Grade.D_PLUS ;
		else if( mark <=65) return Grade.C_MINUS;
		else if( mark <=70) return Grade.C;
		else if( mark <=75) return Grade.C_PLUS;
		else if( mark <=80) return Grade.B_MINUS;
		else if( mark <=85) return Grade.B;
		else if( mark <=90) return Grade.B_PLUS;
		else if( mark <=95) return Grade.A_MINUS;
		else if ( mark <=100) return Grade.A;
		return null;
	}
    public int getMark() {
        return mark;
    }


	public Grade getGrade() {
		return grade;
	}


	public void setGrade(Grade grade) {
		this.grade = grade;
	}
}

