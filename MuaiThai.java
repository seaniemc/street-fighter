package streetFighter;

public final class MuaiThai extends KickBoxer {
	
	int thunderElbow;
	public MuaiThai(int overallHealth, String nickName, double height, double weight, int stamina, int age, int powerKick, int thunderElbow) {
		super(overallHealth, nickName, height, weight, stamina, age, powerKick);
		this.overallHealth = 0;
		this.nickName = "Robbie Diamond Elbows McNeal";
		this.height = 1.8;
		this.weight = 84;
		this.stamina = 0; 
		this.age = 24;
		this.powerKick = 0;
		this.thunderElbow = 8;
	}
	@Override
	public int calculateOverallHealth() {
		// TODO Auto-generated method stub
		return (super.claculateStamina(age, weight)  + super.calculatePowerKick()+ this.thunderElbow);
	}
	@Override
	public void display() 
	{
		System.out.println("==========================================================");
		System.out.println("=========You Have Chossen " +this.nickName+"==============");
		System.out.println(this.nickName+ " Is a Us Marine, Robbie loves nopthing more");
		System.out.println("than cracking skulls with his world renowned Elbow.");
		System.out.println("*His Age is: "+this.age);
		System.out.println("*His Height is: "+this.height+"M");
		System.out.println("*His Weight is: "+this.weight+"Kg");
		System.out.println("*His Power Punch is: "+super.calculatePowerKick()+"/10");
		System.out.println("*His Lighting Speed is: "+this.thunderElbow+"/10");
		System.out.println("*His Overall Health: "+calculateOverallHealth());
		System.out.println("==========================================================");
	}
	
}
