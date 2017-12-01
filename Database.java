import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;

public class Database {
	static Vector <Course> courses = new Vector<Course>();
	static Vector <CourseFile> coursefiles= new Vector<CourseFile>();
	static Vector <User> users =  new Vector <User>();
	static Vector <Teacher> teachers= new Vector <Teacher>();
	static Vector <Manager> managers = new Vector <Manager>();
	static Vector <Student> students  = new Vector <Student>();
	static Vector <Mark> marks = new Vector<Mark>();
	static FileInputStream fis;
	static FileOutputStream fos;
	static ObjectOutputStream oos;
	static ObjectInputStream oin;
	public static void desCourses() throws IOException, ClassNotFoundException{
		fis = new FileInputStream("courses");
		oin = new ObjectInputStream(fis);
		courses = (Vector<Course>) oin.readObject();
	}
	public static void serCourses()throws IOException{
		fos = new FileOutputStream("courses");
		oos = new ObjectOutputStream(fos);
		oos.writeObject(courses);
		oos.close();
	}
	public static void desCourseFiles() throws IOException, ClassNotFoundException{
		fis = new FileInputStream("coursefiles");
		oin = new ObjectInputStream(fis);
		coursefiles = (Vector<CourseFile>) oin.readObject();
	}
	public static void serCourseFiles()throws IOException{
		fos = new FileOutputStream("coursefiles");
		oos = new ObjectOutputStream(fos);
		oos.writeObject(coursefiles);
		oos.close();
	}
	public  static void desUsers() throws IOException, ClassNotFoundException{
		fis = new FileInputStream("users");
		oin = new ObjectInputStream(fis);
		users = (Vector<User>) oin.readObject();
	}
	
	public static void serUsers()throws IOException{
		fos = new FileOutputStream("users");
		oos = new ObjectOutputStream(fos);
		oos.writeObject(users);
		oos.close();
	}
	public  static void desTeachers() throws IOException, ClassNotFoundException{
		fis = new FileInputStream("teachers");
		oin = new ObjectInputStream(fis);
		teachers = (Vector<Teacher>) oin.readObject();
	}
	
	public static void serTeachers()throws IOException{
		fos = new FileOutputStream("teachers");
		oos = new ObjectOutputStream(fos);
		oos.writeObject(teachers);
		oos.close();
	}
	public  static void desManagers() throws IOException, ClassNotFoundException{
		fis = new FileInputStream("managers");
		oin = new ObjectInputStream(fis);
		managers = (Vector<Manager>) oin.readObject();
	}
	
	public static void serManagers()throws IOException{
		fos = new FileOutputStream("managers");
		oos = new ObjectOutputStream(fos);
		oos.writeObject(managers);
		oos.close();
	}
	public  static void desStudents() throws IOException, ClassNotFoundException{
		fis = new FileInputStream("students");
		oin = new ObjectInputStream(fis);
		students = (Vector<Student>) oin.readObject();
	}
	
	public static void serStudents()throws IOException{
		fos = new FileOutputStream("students");
		oos = new ObjectOutputStream(fos);
		oos.writeObject(students);
		oos.close();
	}
	public static void desMarks() throws IOException, ClassNotFoundException{
		fis = new FileInputStream("marks");
		oin = new ObjectInputStream(fis);
		marks = (Vector<Mark>) oin.readObject();
	}
	public static void serMarks()throws IOException{
		fos = new FileOutputStream("marks");
		oos = new ObjectOutputStream(fos);
		oos.writeObject(marks);
		oos.close();
	}
	
}
