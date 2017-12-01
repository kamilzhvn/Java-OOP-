import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.util.Objects;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Vector;


public class Tester {
	public static int hashCode(String password) {
		return Objects.hashCode(password);
	}
	public static void save() throws IOException{
		Database.serUsers();
		Database.serTeachers();
		Database.serManagers();
		Database.serStudents();
		Database.serCourses();
		Database.serCourseFiles();
		Database.serMarks();
		
	}
	public static boolean showUsers(){
		if(Database.users.size()==0) {
			System.out.println("No users yet...");
			return false;
		}
		for(int i=0; i<Database.users.size(); i++)
			System.out.println(i+1+ ")" +Database.users.get(i));
		return true;
	}
	public static boolean showTeachers(){
		if(Database.teachers.size()==0) {
			System.out.println("No teachers yet...");
			return false;
		}
		for(int i=0; i<Database.teachers.size(); i++)
			System.out.println(i+1+ ")" +Database.teachers.get(i));
		return true;
	}
	public static boolean showManagers(){
		if(Database.managers.size()==0) {
			System.out.println("No managers yet...");
			return false;
		}
		for(int i=0; i<Database.managers.size(); i++)
			System.out.println(i+1+ ")" +Database.managers.get(i));
		return true;
	}
	public static boolean showStudents(){
		if(Database.students.size()==0) {
			System.out.println("No students yet...");
			return false;
		}
		for(int i=0; i<Database.students.size(); i++)
			System.out.println(i+1+ ")" +Database.students.get(i));
		return true;
	}
	public static boolean showCourses(){
		if(Database.courses.size()==0) {
			System.out.println("No courses yet...");
			return false;
		}
		for(int i=0; i<Database.courses.size(); i++)
			System.out.println(i+1+ ")" +Database.courses.get(i));
		return true;
	}
	 public static boolean showCourseFiles(){
			if(Database.coursefiles.size()==0) {
				System.out.println("No coursefiles yet...");
				return false;
			}
			for(int i=0; i<Database.coursefiles.size(); i++)
				System.out.println(i+1+ ")" +Database.coursefiles.get(i));
			return true;
	}
	public static boolean showMarks(){
			if(Database.marks.size()==0) {
				System.out.println("No marks yet...");
				return false;
			}
			for(int i=0; i<Database.marks.size(); i++)
				System.out.println(i+1+ ")" +Database.marks.get(i));
			return true;
	}
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Scanner in = new Scanner(System.in);
		if(new File("courses").exists()) {Database.desCourses();}
		if(new File("students").exists()) {Database.desStudents();}
		if(new File("coursefiles").exists()) {Database.desCourseFiles();}
		if(new File("marks").exists()) {Database.desCourseFiles();}
		
		String password;
		String username;
						
		try {
			
			
			
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
			BufferedReader brFile = new BufferedReader(new FileReader("admin.txt"));
	        
			
			username = br.readLine();
			password = br.readLine();
			
			
			
			StringTokenizer st = new StringTokenizer(brFile.readLine(), " ", false);
		    String adminName = st.nextToken();
			adminName = st.nextToken();
			
			st = new StringTokenizer(brFile.readLine(), " ", false);
			
			String adminPass = st.nextToken();
			adminPass = st.nextToken();
			
			brFile.close();
			
			if (hashCode(password) == hashCode(adminPass) && username.equals(adminName)) {
				
				bw.write("You entered as ADMIN\n");
				menu : while(true){
					System.out.println("What do you want to do?");
					System.out.println("\n 1) Add new user \n 2) Update existing users   \n 3) Remove the user  \n 4) Exit");
					int choice = in.nextInt();
					if(choice==1){
						addStudent: while(true){
							System.out.println("Enter name: ");
							Database.users.add(new User(in.next()));
							System.out.println("User added! ");
							System.out.println("\n 1) Add another user \n 2) Return back \n 3) Exit");
							choice = in.nextInt();
							if(choice==1) continue addUser;
							if(choice==2) continue menu;
							if(choice==5) {System.out.println("Bye!!!"); save();  break menu;}
							break;
						}
					}
					else if (choice==2){
						addCourse: while(true){
							System.out.println("Enter name of the user: ");
							System.out.println("User updated ");
							System.out.println("\n 1) Return back \n 2) Exit");
							choice = in.nextInt();
							if(choice==1) continue menu;
							if(choice==2) {System.out.println("Bye!!!"); save();  break menu;}
							break;
						}
					}
					else if (choice==3){
						addCourseToStudent: while(true){
							System.out.println("Choose user, which you want to remove: (Enter id)");
							if(!showUsers()) continue menu;
							User s = Database.users.remove(in.nextInt()-1);
							System.out.println("\n 1) Return back \n 2) Exit");
							choice = in.nextInt();
							if(choice==1) continue menu;
							if(choice==2) {System.out.println("Bye!!!"); save();  break menu;}
							break;
						}
					}
					else if (choice==4){
						System.out.println("Bye!!!"); 
						save();
						break menu;
					}
				}
				
				
			} else if {
				bw.write("You entered as Teacher\n");
				
			
				menu : while(true){
					System.out.println("What do you want to do?");
					System.out.println("\n 1) View courses \n 2) Manage	Course	files \n 3) Put	marks \n "
							+ "4) Send	order	to	Executors \n 5)View	Students,	info	about	students  \n 6) Exit");
					
					int choice = in.nextInt();
					if(choice==1){
					
						addStudent: while(true){
							System.out.println("Enter the  name of course: ");
							Database.courses.get(new Student(in.next()));
							
							System.out.println("\n 1) Return back \n 2) Exit");
							choice = in.nextInt();
							if(choice==1) continue menu;
							if(choice==2) {System.out.println("Bye!!!"); save();  break menu;}
							break;
						}
					}
					else if (choice==2){
						addCourse: while(true){
							System.out.println("Enter name of the course: ");
							Database.courses.add(new Course(in.next()));
							System.out.println("Course added! ");
							System.out.println("\n 1) Add another course  \n 2) Return back \n 3) Exit");
							choice = in.nextInt();
							if(choice==1) continue addCourse;
							if(choice==2) continue menu;
							if(choice==3) {System.out.println("Bye!!!"); save();  break menu;}
							break;
						}
					}
					else if (choice==3){
						addCourseToStudent: while(true){
							System.out.println("Choose student to which you want to add course: (Enter number)");
							if(!showStudents()) continue menu;
							Student s = Database.students.get(in.nextInt()-1);
							System.out.println("Choose course: (Enter number)");
							if(!showCourses()) continue menu;
							int i = in.nextInt()-1;
							s.courses.add(Database.courses.get(i));
							System.out.println("Course "+Database.courses.get(i) +" added to  "+s.name);
							System.out.println("\n 1) Add another course to some student  \n 2) Return back \n 3) Exit");
							choice = in.nextInt();
							if(choice==1) continue addCourseToStudent;
							if(choice==2) continue menu;
							if(choice==3) {System.out.println("Bye!!!"); save();  break menu;}
							break;
						}
					}
					else if (choice==4){
						if(!showStudents()) continue menu;
						System.out.println("\n 1) Return back \n 2) Exit");
						choice = in.nextInt();
						if(choice==1) continue menu;
						if(choice==2) {System.out.println("Bye!!!"); save();  break menu;}
						break;
					}
					else if (choice==5){
						System.out.println("Bye!!!"); 
						save();
						break menu;
					} 
				}	
			} else if{
				
			bw.write("Welcome!You entered as Manager\\n");
			menu : while(true){
				System.out.println("What do you want to do?");
				System.out.println("\n 1) Approve student's registration \n 2) Asign courses to teachers   \n 3) CReate statistical report   \n 4) Manage views \n 5) Exit");
				int choice = in.nextInt();
				if(choice==1){
					addStudent: while(true){
						System.out.println("Enter name: ");
						Database.students.add(new Student(in.next()));
						System.out.println("Student added! ");
						System.out.println("\n 1) Add another student  \n 2) Return back \n 3) Exit");
						choice = in.nextInt();
						if(choice==1) continue addStudent;
						if(choice==2) continue menu;
						if(choice==5) {System.out.println("Bye!!!"); save();  break menu;}
						break;
					}
				}
				else if (choice==2){
					addCourse: while(true){
						System.out.println("Enter name of the course: ");
						Database.courses.add(new Course(in.next()));
						System.out.println("Course added! ");
						System.out.println("\n 1) Add another course  \n 2) Return back \n 3) Exit");
						choice = in.nextInt();
						if(choice==1) continue addCourse;
						if(choice==2) continue menu;
						if(choice==3) {System.out.println("Bye!!!"); save();  break menu;}
						break;
					}
				}
				else if (choice==3){
					addCourseToStudent: while(true){
						System.out.println("Choose student to which you want to add course: (Enter number)");
						if(!showStudents()) continue menu;
						Student s = Database.students.get(in.nextInt()-1);
						System.out.println("Choose course: (Enter number)");
						if(!showCourses()) continue menu;
						int i = in.nextInt()-1;
						s.courses.add(Database.courses.get(i));
						System.out.println("Course "+Database.courses.get(i) +" added to  "+s.name);
						System.out.println("\n 1) Add another course to some student  \n 2) Return back \n 3) Exit");
						choice = in.nextInt();
						if(choice==1) continue addCourseToStudent;
						if(choice==2) continue menu;
						if(choice==3) {System.out.println("Bye!!!"); save();  break menu;}
						break;
					}
				}
				else if (choice==4){
					if(!showStudents()) continue menu;
					System.out.println("\n 1) Return back \n 2) Exit");
					choice = in.nextInt();
					if(choice==1) continue menu;
					if(choice==2) {System.out.println("Bye!!!"); save();  break menu;}
					break;
				}
				else if (choice==5){
					System.out.println("Bye!!!"); 
					save();
					break menu;
				}
			}
			
			br.close();
			bw.close();
			
			brFile.close();
			
			ois.close();
			fis.close();
			
			FileOutputStream fos = new FileOutputStream("courses.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(courses);
			oos.flush();
			oos.close();
			fos.close();
			
		} catch(IOException ioe) {
			System.out.println("Can’t read!");
		} 
		catch (ClassNotFoundException e) {
			System.out.println("Class not found!");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		try {
			System.out.println("Welcome!");
			menu : while(true){
				System.out.println("What do you want to do?");
				System.out.println("\n 1) Add student \n 2) Add course  \n 3) Add course to a Student  \n 4) View students \n 5) Exit");
				int choice = in.nextInt();
				if(choice==1){
					addStudent: while(true){
						System.out.println("Enter name: ");
						Database.students.add(new Student(in.next()));
						System.out.println("Student added! ");
						System.out.println("\n 1) Add another student  \n 2) Return back \n 3) Exit");
						choice = in.nextInt();
						if(choice==1) continue addStudent;
						if(choice==2) continue menu;
						if(choice==5) {System.out.println("Bye!!!"); save();  break menu;}
						break;
					}
				}
				else if (choice==2){
					addCourse: while(true){
						System.out.println("Enter name of the course: ");
						Database.courses.add(new Course(in.next()));
						System.out.println("Course added! ");
						System.out.println("\n 1) Add another course  \n 2) Return back \n 3) Exit");
						choice = in.nextInt();
						if(choice==1) continue addCourse;
						if(choice==2) continue menu;
						if(choice==3) {System.out.println("Bye!!!"); save();  break menu;}
						break;
					}
				}
				else if (choice==3){
					addCourseToStudent: while(true){
						System.out.println("Choose student to which you want to add course: (Enter number)");
						if(!showStudents()) continue menu;
						Student s = Database.students.get(in.nextInt()-1);
						System.out.println("Choose course: (Enter number)");
						if(!showCourses()) continue menu;
						int i = in.nextInt()-1;
						s.courses.add(Database.courses.get(i));
						System.out.println("Course "+Database.courses.get(i) +" added to  "+s.name);
						System.out.println("\n 1) Add another course to some student  \n 2) Return back \n 3) Exit");
						choice = in.nextInt();
						if(choice==1) continue addCourseToStudent;
						if(choice==2) continue menu;
						if(choice==3) {System.out.println("Bye!!!"); save();  break menu;}
						break;
					}
				}
				else if (choice==4){
					if(!showStudents()) continue menu;
					System.out.println("\n 1) Return back \n 2) Exit");
					choice = in.nextInt();
					if(choice==1) continue menu;
					if(choice==2) {System.out.println("Bye!!!"); save();  break menu;}
					break;
				}
				else if (choice==5){
					System.out.println("Bye!!!"); 
					save();
					break menu;
				}
			}
		} catch (Exception e) {
			System.out.println("Something bad happened... \n Saving resources...");
			e.printStackTrace();
			save();
		}
	}
}

