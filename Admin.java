
public class Admin extends Employee {
	public Admin(String name, int id) {
			super(name,id);
			this.id = Database.students.size()+1;
	}
		
    public static void add(Student student) {
    	Database.students.add(student);
    }

   
    public static void remove(Student student) {
    	Database.students.remove(student);
    }

   
    public static void update(Student s1,Student s2) {
       for(int i = 0; i < Database.students.size(); i++)
       {
    	   if (s1.equals(Database.students.get(i)))
    		   Database.students.set(i, s2);
       }
    }
}

