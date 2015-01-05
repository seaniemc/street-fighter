/*
 * Sean McGrath g00316649
 * Street Fighter game
 * 
 */


package streetFighter;

public abstract class Fighter {
	
	int overallHealth;
	String nickName;
	double height;
	double weight;
	int stamina;
	int age;
	
	public Fighter(int overallHealth, String nickName, double height,double weight, int stamina, int age) 
	{
		super();
		this.overallHealth = overallHealth;
		this.nickName = nickName;
		this.height = height;
		this.weight = weight;
		this.stamina = stamina;
		this.age = age;
	}
	//==================getters and setters===============================
	public int getOverallHealth() {
		return overallHealth;
	}
	public void setOverallHealth(int overallHealth) {
		this.overallHealth = overallHealth;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public int getStamina() {
		return stamina;
	}
	public void setStamina(int stamina) {
		this.stamina = stamina;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	//============abstract method============
	public abstract int calculateOverallHealth();
	
	//calculate stamina based on age and weight
	public int claculateStamina(int age, double weight ) 
	{
		if((this.age > 22 && this.age < 30) && (this.weight > 80 && this.weight < 87 ))
		{
			this.stamina = 10;
		}
		else if((this.age > 22 && this.age < 30) && (this.weight > 88 && this.weight < 95 ))
		{
			this.stamina = 7;
		}
		else if((this.age > 22 && this.age < 30) && (this.weight > 96 && this.weight < 105 ))
		{
			this.stamina = 5;
		}
		else if((this.age > 31 && this.age < 38) && (this.weight > 80 && this.weight < 87 ))
		{
			this.stamina = 8;
		}
		else if((this.age > 31 && this.age < 38) && (this.weight > 88 && this.weight < 95 ))
		{
			this.stamina = 6;
		}
		else if((this.age > 31 && this.age < 38) && (this.weight > 96 && this.weight < 105 ))
		{
			this.stamina = 4;
		}
		else if((this.age > 39 && this.age < 45) && (this.weight > 80 && this.weight < 87 ))
		{
			this.stamina = 7;
		}
		else if((this.age > 39 && this.age < 45) && (this.weight > 88 && this.weight < 95 ))
		{
			this.stamina = 5;
		}
		else if((this.age > 39 && this.age < 45) && (this.weight > 96 && this.weight < 105 ))
		{
			this.stamina = 3;
		}
		return this.stamina;
	}
	
	public boolean  equals(Fighter otherFighter)
	{
		if(this.nickName.equalsIgnoreCase(otherFighter.nickName)) return true;
		else
		return false;
		
	}
	public abstract void display();
	
	
}
