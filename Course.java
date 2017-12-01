import java.io.Serializable;
import java.util.Vector;

public class Course implements Serializable {

    private Vector<CourseFile> files;
    private Teacher teacher;
    private int credits;
	public String name;
	
	public Course(String name) {
		super();
		this.name = name;
	}
	
	public String toString(){
		return name;
	}


    public Vector<CourseFile> getFiles() {
        return files;
    }
   


    public Teacher getTeacher() {
        return teacher;
    }

    public int getCredits() {
        return credits;
    }
}

