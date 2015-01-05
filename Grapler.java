package streetFighter;

public abstract class Grapler extends Fighter {
	
	int powerSubmission;
	
	public Grapler(int overallHealth, String nickName, double height, double weight, int stamina, int age, int powerSubmission) {
		super(overallHealth, nickName, height, weight, stamina, age);
		this.powerSubmission = powerSubmission;
		
	}
//=========getters and setters======	
	public int getPowerSubmission() {
		return powerSubmission;
	}

	public void setPowerSubmission(int powerSubmission) {
		this.powerSubmission = powerSubmission;
	}

	public int calculatePowerSubmission()
	{
		if (this.weight > 80 && this.weight < 87 )
		{
			this.powerSubmission = 5;
		}
		else if (this.weight > 88 && this.weight < 95 )
		{
			this.powerSubmission = 7;
		}
		else if (this.weight > 96 && this.weight < 105 )
		{
			this.powerSubmission = 9;
		}
		
		return (this.powerSubmission);
	}
}
