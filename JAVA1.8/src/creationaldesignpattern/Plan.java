package creationaldesignpattern;

public abstract class Plan {
	
	protected double rate;

	abstract void getRate();
	
	public void calculateBill(int units) {
		 System.out.print("Total Rate :"+units*rate);  
		
	}
	
	


	


}
