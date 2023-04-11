package something;

public class Zaman_Static_P {
	
	
/*
	//Static Void Method.
	//public static void getSalary() {
		int mahin = 15000;
		int masud = 2000;
		double rafi = 300.55;
		double total = mahin+masud+rafi; 
		System.out.println(total);
  }
*/
		
//__________________________________________________________________________________________________		
/*
	//Static return Method/Non-Void
		public static double getBonus(){
			int tanvir  = 15000;
			int hujur = 11000;
			double shanto = 400.55;
			double total90 = tanvir+hujur+shanto; 
			return total90;	
	}
*/
	
//___________________________________________________________________________________________________	
/*
	//Static Void Parameterized. 
		static void getAge(int x, int y){
			
			 int total3= x+y;
			 System.out.println(total3);	
		}
*/
//____________________________________________________________________________________________________	
	
	//Static Return Parameterized.
	public static int getCommission(int rafi, int fahim){
		int total7 = rafi+fahim;
		return total7;
		
	
	}

//____________________________________________________________________________________________________
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//____________________________________________________________________________________________________
		
		   
		
		
			   //Static Void Method.
		//Zaman_Static_P.getSalary();
		
		
		
		       //Static return Method/Non-Void
		//System.out.println(getBonus());
		
		
		       //Static Void Parameterized
		//Zaman_Static_P.getAge(2, 3);
		
		
		       //Static Return Parameterized.
		System.out.println(getCommission(5000, 6000));
			
		
	}

}
