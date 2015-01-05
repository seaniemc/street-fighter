package streetFighter;

public final class BareKnuckleBoxer extends Boxer{
	
	int handsOfSteel;
	public BareKnuckleBoxer(int overallHealth, String nickName, double height, double weight, int stamina, int age, int powerPunch, int handsOfSteel) 
	{
		super(overallHealth, nickName, height, weight, stamina, age, powerPunch);
		this.handsOfSteel = 9;  
		this.overallHealth = 0;
		this.nickName = "Carl The Jackel Henson";
		this.height = 2.05;
		this.weight = 97;
		this.stamina = 0;
		this.powerPunch = 0;
		this.age = 39;
	}
	
	public int calculateOverallHealth() 
	{
		return (super.claculateStamina(age, weight)  + super.calculatePowerPunch()+ this.handsOfSteel);
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
		System.out.println(this.nickName+ " Is a hard-nosed, hard punching, criminal");
		System.out.println("Who breaks bones for a living.");
		System.out.println("*His Age is: "+this.age);
		System.out.println("*His Height is: "+this.height+"M");
		System.out.println("*His Weight is: "+this.weight+"Kg");
		System.out.println("*His Power Punch is: "+super.calculatePowerPunch()+"/10");
		System.out.println("*His Lighting Speed is: "+this.handsOfSteel+"/10");
		System.out.println("*His Overall Health: "+calculateOverallHealth());
		System.out.println("=====================================================");
	}
	
}
