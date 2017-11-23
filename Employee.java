/**
 */
public class Employee extends User implements Comparable
{
    
    public Employee(String name, String surname, String id, String password) {
		super(name, surname, id, password);
		
	}

	private int salary;
    private int workExperience;
    private Order order;
    public int getSalary() {
        return salary;
    }
    public int getWorkExperience() {
        return workExperience;
    }
    public void giveOrder(Order order) {
    	this.order = order;
    }
     public int compareTo(Object obj) {
        Employee other = (Employee) obj;
        if(salary != other.salary && workExperience != other.workExperience && order != other.order) {
               return -1;
        }
        else 
        	return 1;
        
    }
    
}

