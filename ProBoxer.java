package streetFighter;

public final class ProBoxer extends Boxer {
	
	int lightingSpeed;
	
	public ProBoxer(int overallHealth, String nickName, double height, double weight, int stamina, int age, int powerPunch, int lightingSpeed) {
		super(overallHealth, nickName, height, weight, stamina, age, powerPunch);
		this.lightingSpeed = 7; 
		this.overallHealth = 0;
		this.nickName = "Jimmy Rock Hands";
		this.height = 1.9;
		this.weight = 90;
		this.stamina = 11;
		this.powerPunch = 0;
		this.age = 27;
	}
	
	public int calculateOverallHealth()
	{
		try
		{
			if(getStamina() > 10)
			{
				throw new StaminaCalculationException("\n Stamina Cant be above 10...\n");
			}			
			
		}
		catch(StaminaCalculationException e)
		{
			System.out.println(e.getMessage());			
		}		
	
		return (super.claculateStamina(age, weight)  + super.calculatePowerPunch()+ this.lightingSpeed);		
	}
	
	public int claculateStamina(int age, double  weight) 
	{
		return super.claculateStamina(age, weight);
	}
	
	@Override
	public void display() 
	{
		System.out.println("========================================================");
		System.out.println("=========You Have Chossen " +this.nickName+"============");
		System.out.println(this.nickName+ " Is a X Pro-Boxer who is down on his Luck");
		System.out.println("He has taken to Street Fighting to earn a curst.");
		System.out.println("*His Age is: "+this.age);
		System.out.println("*His Height is: "+this.height+"M");
		System.out.println("*His Weight is: "+this.weight+"Kg");
		System.out.println("*His Power Punch is: "+super.calculatePowerPunch()+"/10");
		System.out.println("*His Lighting Speed is: "+this.lightingSpeed+"/10");
		System.out.println("*His Overall Health: "+calculateOverallHealth());
		System.out.println("========================================================");
	}

	
}
