package HashAndEqual;

public class Student implements Comparable  {

	public int id;
	public String name;

	public Student(int id,String name){
		this.id=id;
		this.name=name;

	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

	//comparable
	//String class implements from comparable interface so, String class has CompareTo().
	public int compareTo(Object obj) {

		return this.hashCode()-  obj.hashCode();
	}

}
