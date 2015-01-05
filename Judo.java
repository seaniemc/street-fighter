package streetFighter;

public final class Judo extends Grapler implements GrapplerMoves{
	
	int deadThrow;
	public Judo(int overallHealth, String nickName, double height, double weight, int stamina, int age, int powerSubmission,int deadThrow) {
		super(overallHealth, nickName, height, weight, stamina, age, powerSubmission);
		this.overallHealth = 0;
		this.nickName = "Damien The Dead McKnuckle";
		this.height = 2.0;
		this.weight = 100;
		this.stamina = 0; 
		this.age = 40;
		this.powerSubmission = 0;
		this.deadThrow = 7;
	}
	@Override
	public int calculateOverallHealth() {
		return (super.claculateStamina(age, weight)  + super.calculatePowerSubmission()+ this.deadThrow);
	}
	@Override
	public void display() {
		System.out.println("=====================================================================");
		System.out.println("==============You Have Chossen " +this.nickName+"====================");
		System.out.println(this.nickName+ " Is street fighters, most flexible contestant");
		System.out.println("He is a submissions expert, with the arm-bar being hi signature move.");
		System.out.println("*His Age is: "+this.age);
		System.out.println("*His Height is: "+this.height+"M");
		System.out.println("*His Weight is: "+this.weight+"Kg");
		System.out.println("*His Power Submission is: "+ super.calculatePowerSubmission()+"/10");
		System.out.println("*His Dead Throw is: "+this.deadThrow+"/10");
		System.out.println("*His Overall Health: "+calculateOverallHealth());
		System.out.println("=====================================================================");
	}
	@Override
	//implementing interface//
	public int calculateGrapplingMove() {
		// TODO Auto-generated method stub
		return this.powerSubmission + this.deadThrow;
	}

}
