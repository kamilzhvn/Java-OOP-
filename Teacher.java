import java.util.*;

public class Teacher extends Employee  implements Comparable{

	private HashMap<Course, TreeSet<Student>> courses;
	private Map students;
	private Schedule schedule;
	private int rating;
	
	public Teacher(String name, int id) {
		super(name, id);
		this.id = Database.teachers.size()+1;
	}
	public Map getStudents() {
	    return students;
	}
	
	public void putMark(Mark mark, Student student) {
		   students.put(student, mark);
	}
	
	
	

	public Set <Course> getCourses() {
		return courses.keySet();
	}
	
	public int getRating() {
	    return 0;
	}
	
	public int compareTo() {
	    return 0;
	}

	@Override

	public int compareTo(Object obj) {
        Teacher other = (Teacher) obj;
        if(students != other.students && schedule != other.schedule && rating != other.rating) {
               return -1;
        }
        else 
        	return 1;
        
    }
	
}

