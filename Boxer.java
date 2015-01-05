package streetFighter;

public abstract class Boxer extends Fighter {
	
	int powerPunch;
	
	public Boxer(int overallHealth, String nickName, double height, double weight, int stamina, int age, int powerPunch) 
	{
		super(overallHealth, nickName, height, weight, stamina, age);
		this.powerPunch = powerPunch;
	}
	//==================getters and setters==========
	public int getPowerPunch() {
		return powerPunch;
	}

	public void setPowerPunch(int powerPunch) {
		this.powerPunch = powerPunch;
	}
	
	public int calculatePowerPunch()
	{
		if (this.weight > 80 && this.weight < 87 )
		{
			this.powerPunch = 5;
		}
		else if (this.weight > 88 && this.weight < 95 )
		{
			this.powerPunch = 7;
		}
		else if (this.weight > 96 && this.weight < 105 )
		{
			this.powerPunch = 9;
		}
		
		return (this.powerPunch);
	}
}
