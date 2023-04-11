package itJob.ny.inheritance;


//Child Class
public class Class_B  extends Class_A{
	
	
	public void gettingPaid() {
		System.out.println("I am getting paid");
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Class_B obj = new Class_B();
		obj.getJob();
		obj.gettingPaid();
		
		obj.getSalary();
		
		
	}

}
