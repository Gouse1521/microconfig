package creationaldesignpattern;

public class DomesticPlan extends Plan{
	@Override
	void getRate() {
		rate=3.1;
	System.out.println("DomesticPlanRate :"+rate);	
	}

}
