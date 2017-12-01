import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.Vector;

public class Student extends User implements Serializable{
    
    private double GPA;
    private Vector<Schedule> schedule;
    private HashMap<Course, Mark> courses;
    private Transcript transcript;
    int id;
    
    public Student(String name, int id) {
		super(name,id);
		this.id = Database.students.size()+1;
	}
	
    public double getGPA(Mark mark, Course course) {
        
    	return GPA;
    }

   
    public void rateTeacher(String teacherName, int rate) {
    	
    }


    public Transcript getTranscript() {
        return transcript;
    }

   
    public Vector<Schedule> getSchedule() {
        return schedule;
    }

    
   
   
    public HashMap<Course, Mark> getCourses() {
    	return courses;    	
    }

    
    public int compareTo() {
        return 0;
    }
    	
    public boolean addCourse(Course c){
		return Database.courses.add(c);
	}
	public String toString(){
		return name+ ", id is "+id+", registered courses:  "+(courses.size()==0?"No courses yet ":courses);
	}
    
}

