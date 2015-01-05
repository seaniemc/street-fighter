package streetFighter;

public final class Taekwondo extends KickBoxer{
	
	int superRoundHouse;
	public Taekwondo(int overallHealth, String nickName, double height,double weight, int stamina, int age, int powerKick, int superRoundHouse) {
		super(overallHealth, nickName, height, weight, stamina, age, powerKick);
		this.overallHealth = 0;
		this.nickName = "Bae The Nightmare Aroon";
		this.height = 1.7;
		this.weight = 90.0;
		this.stamina = 0; 
		this.age = 32;
		this.powerKick = 0;
		this.superRoundHouse = 9;
	}
	@Override
	public int calculateOverallHealth() {
		// TODO Auto-generated method stub
		return (super.claculateStamina(age, weight)  + super.calculatePowerKick()+ this.superRoundHouse);
	}
	@Override
	public void display() {
		System.out.println("==========================================================");
		System.out.println("=========You Have Chossen " +this.nickName+"==============");
		System.out.println(this.nickName+ " is a member of the Triad Gangs, his family");
		System.out.println("were brutaly murdered, this vicious man will stop at nothing");
		System.out.println("to get the win.");
		System.out.println("*His Age is: "+this.age);
		System.out.println("*His Height is: "+this.height+"M");
		System.out.println("*His Weight is: "+this.weight+"Kg");
		System.out.println("*His Power Kick is: "+super.calculatePowerKick()+"/10");
		System.out.println("*His Round House Kick is: "+this.superRoundHouse+"/10");
		System.out.println("*His Overall Health: "+calculateOverallHealth());
		System.out.println("==========================================================");
	}

}
