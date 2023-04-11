package something;

public class Method_Test {
	
	
	
	public static void getEmp() { //void method 
		System.out.println(Variable_declare.course);
	}
	
	public int getSalry() {// NOn
		int salary= 1500;
		return salary;
		
		
		
	}
	
	public  void getName (String name) {
		System.out.println(name);
		
	
		Method_Test.getEmp();
	    Method_Test obj = new  Method_Test();
	    System.out.println("Alam Salary is = " + obj.getSalry());
	    obj.getName("QA Liton Bhai");
		
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		
	}

}
