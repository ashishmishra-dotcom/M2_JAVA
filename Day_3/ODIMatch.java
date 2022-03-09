public class ODIMatch extends Match {

	public ODIMatch() {
		super();
		// TODO Auto-generated constructor stub
		
	}



	@Override
	float calculateRunRate() {
		// TODO Auto-generated method stub
		return ((getTarget()-getCurrentScore())/(50-getCurrentOver()));
		
	}

	@Override
	float calculateBalls() {
		// TODO Auto-generated method stub
		
		return 6*(50-getCurrentOver());
	}
	
	public void display()
	{
		System.out.println("Need "+(getTarget()-getCurrentScore())+" runs in "+(int)calculateBalls() + " balls");
		System.out.println("Required Runrate: "+calculateRunRate());
		
	}
}