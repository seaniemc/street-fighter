package streetFighter;

public class StaminaCalculationException extends Exception {
	
	public StaminaCalculationException(String problem)	// taking in the string with the error message
	{	
		super(problem);						// sending the string to the super(exception class)
	}

}
