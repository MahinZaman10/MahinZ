package something;

public class Conditions_Practice {

	
	//If i were to buy a car, I can only Spend $8000. --> Condition
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//everything is put in main method to because in order to execute. 

		int carPrice = 8000; //-->Variable
		
		
		if (carPrice >9000) {
			System.out.println("I won't Buy the car");
		}
		
		else if (carPrice <8000) {
			System.out.println("I will buy the car");
		}
		else if (carPrice ==8000) {
			System.out.println("I will accept the offer");
		}
		else {
			System.out.println("No Match found");
		}
	}

}
