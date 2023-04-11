package something;

public class Variable_declare {

	//Static method 
	
	String name = "SmartTech";    // --> INstance Variable. 
	static String course = "Automation"; // --> Static Variable
	
	
	public static void main(String[] args) {
		int salary = 1500; //-->Local variable
		
		
		System.out.println(salary);
		System.out.println(course);
	}
	
	
	public void getSalary() { //-->Non_Static Method 
		System.out.println(course);
		System.out.println(name);
		
		
		
		
	}
	
	
}


// Within the class any non static method in can be used anywhere. 