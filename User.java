import java.io.Serializable;

public class User implements Serializable {
	protected String name;
	private String surname;
	protected int id;
    private String password;

    public User(String name, String surname, int id, String password) {
		this.name = name;
		this.surname = surname;
		this.id = id;
		this.password = password;
	}
    public User (String name,int id){
    	this.name = name;
    	this.id = Database.users.size()+1;
    }
    
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    
    @Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof User)) {
			return false;
		}
		User other = (User) obj;
		if(id != other.id) return false;
		
		
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		if (password == null) {
			if (other.password != null) {
				return false;
			}
		} else if (!password.equals(other.password)) {
			return false;
		}
		if (surname == null) {
			if (other.surname != null) {
				return false;
			}
		} else if (!surname.equals(other.surname)) {
			return false;
		}
		return true;
	}
    
    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((surname == null) ? 0 : surname.hashCode());
		return result;
	}

	public String toString() {
		return "User [name=" + name + ", surname=" + surname + ", id=" + id + ", password=" + password + "]";
	}

   
}

