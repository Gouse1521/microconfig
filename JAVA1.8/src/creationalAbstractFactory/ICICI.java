package creationalAbstractFactory;

public class ICICI implements Bank{
 
	private final String BNAME;
	ICICI(){
		this.BNAME = "ICICI BANK";
		
		
	}
	
	
	@Override
	public String getBankName() {
		// TODO Auto-generated method stub
		return BNAME;
	}

}
