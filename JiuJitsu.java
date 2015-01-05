package streetFighter;

public final class JiuJitsu extends Grapler implements GrapplerMoves{

	int deadlyArmBar;
	public JiuJitsu(int overallHealth, String nickName, double height, double weight, int stamina, int age, int powerSubmission,int deadlyArmBar) 
	{
		super(overallHealth, nickName, height, weight, stamina, age, powerSubmission);
		this.overallHealth = 0;
		this.nickName = "Jerry The Bendy Mcintosh";
		this.height = 1.9;
		this.weight = 81;
		this.stamina = 0; 
		this.age = 26;
		this.powerSubmission = 0;
		this.deadlyArmBar = 6;
	}

	@Override
	public int calculateOverallHealth() 
	{
		
		return (super.claculateStamina(age, weight)  + super.calculatePowerSubmission()+ this.deadlyArmBar);
	}

	
	public void display() 
	{
		System.out.println("=====================================================================");
		System.out.println("==============You Have Chossen " +this.nickName+"====================");
		System.out.println(this.nickName+ " Is street fighters, most flexible contestant");
		System.out.println("He is a submissions expert, with the arm-bar being hi signature move.");
		System.out.println("*His Age is: "+this.age);
		System.out.println("*His Height is: "+this.height+"M");
		System.out.println("*His Weight is: "+this.weight+"Kg");
		System.out.println("*His Power Punch is: "+ super.calculatePowerSubmission()+"/10");
		System.out.println("*His Lighting Speed is: "+this.deadlyArmBar+"/10");
		System.out.println("*His Overall Health: "+calculateOverallHealth());
		System.out.println("=====================================================================");
	}

	@Override
	//implementing interface//
	public int calculateGrapplingMove() {
		
		return this.deadlyArmBar + this.powerSubmission;
	}
		
	

}
