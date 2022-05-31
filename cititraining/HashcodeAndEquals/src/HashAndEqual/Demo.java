package HashAndEqual;


import java.util.HashMap;
import java.util.Map;

public class Demo  {

	//comparator
	//comparing intger values and return 1 /-1 or true/false
	public int compare(Object o1,Object o2) {
		Student s1=(Student)o1;
		Student s2=(Student)o2;
		if(s1.id==s2.id) {
			return -1;
		}
		else {
			return 1;
		}
	}


	public static void main(String[] args) {

		Student std1= new Student(1, "sai");
		Student std2= new Student(2, "sai");

		Map<Student, String> st1=new HashMap<Student, String>();
		st1.put(std1, "Btech");
		st1.put(std2, "Btech");

		System.out.println(st1.size());
		System.out.println(st1.entrySet());

		System.out.println(std1.equals(std2));
		
		//comparator method
		Demo test =new Demo();
		int com=test.compare(std1, std2);
		if(com==-1) {
			System.out.println("duplicate Student id");
		}
		else {
			System.out.println("okk");
		}
		
		//comparable String
		System.out.println(std1.name.compareTo(std2.name));
		int st= std1.name.compareTo(std2.name);
		if(st==0) {
			System.out.println("duplicate values");
		}
		else {
			System.out.println("okk");
		}
	}
}


