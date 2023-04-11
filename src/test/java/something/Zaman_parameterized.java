package something;

public class Zaman_parameterized {

	
	//Parameterized Void method 
	public void Getworkers(int salary, int bonus) { 
		int totalSalary = salary + bonus;
		String Year = "Total Salary Is = ";
		System.out.println(Year+totalSalary);
		
		
	}
	
	//Main Method
	public static void main(String[] args) {
		
		
	//Creating an Object 
	Zaman_parameterized obj = new Zaman_parameterized();
	
	obj.Getworkers(7000,2500);
	
	
	//Different values
	obj.Getworkers(1000,2500);
	obj.Getworkers(2000,2500);
	obj.Getworkers(3000,2500);
	obj.Getworkers(4000,2500);
	
	
	
	
	
	
	}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

