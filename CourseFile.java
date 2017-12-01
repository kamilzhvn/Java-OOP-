import java.lang.*;

public class CourseFile {
    
    private Course course;

    private String fileName;

    private String fileType;

    public Course getCourse() {
        return course;
    }
   
	public CourseFile(String filename) {
		super();
		this.fileName = filename;
	}
	public String toString(){
		return fileName;
	}
    public String getFileName() {
        return fileName;
    }

    public String getFileType() {
        return fileType;
    }
}

