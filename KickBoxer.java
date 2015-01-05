package streetFighter;

public abstract class KickBoxer extends Fighter {
	
	int powerKick;
	
	public KickBoxer(int overallHealth, String nickName, double height, double weight, int stamina, int age, int powerKick) {
		super(overallHealth, nickName, height, weight, stamina, age);
		this.powerKick = powerKick;
	}
	//=======getters and setters
	public int getPowerKick() {
		return powerKick;
	}
	public void setPowerKick(int powerKick) {
	this.powerKick = powerKick;
	}
	
	public int calculatePowerKick()
	{
		if (this.weight > 80 && this.weight < 87 )
		{
			this.powerKick = 5;
		}
		else if (this.weight > 88 && this.weight < 95 )
		{
			this.powerKick = 7;
		}
		else if (this.weight > 96 && this.weight < 105 )
		{
			this.powerKick = 9;
		}
		
		return (this.powerKick);
	}
	
}
