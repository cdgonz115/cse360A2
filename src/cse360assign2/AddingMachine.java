package cse360assign2;
/**
 * 
 * @author Christian Gonzalez
 *	class ID (85141)
 */
/**
 * Object that is used as a calculator for addition and subtraction
 * @param Integer total
 * @param String transaction
 */

public class AddingMachine {
	
	private int total;
	private String transaction;
	
	/**
	 * Default Constructor, makes the private int variable total equal to 0 and
	 * the private String variable transaction equal to ""
	 * @param total
	 * @param transaction
	 */
	public AddingMachine () {
		total = 0 ;  // not needed - included for clarity
		transaction = "";
	}
	/**
	 * Method that returns the value of the total at that time
	 * @return variable total
	 */
	public int getTotal () {
			return total;	//returns the total
	}
	/**
	 * Method that adds the value passed to the current total as well as update the transaction String
	 * @param value
	 */
	public void add (int value) 
	{
		if ( total == 0 ) transaction += total;
		transaction += " + " + value;			//adds the passed value to the transaction string along with the plus symbol
		total += value;						//adds the passed value to the total
	}
	/**
	 * Method that subtracts the value passed to the current total as well as update the transaction String
	 * @param value
	 */
	public void subtract (int value)
	{
		if ( total == 0 ) transaction += total;
		transaction += " - " + value;			//adds the passed value to the transaction string along with the minus symbol						
		total -= value;						//subtracts the passed value to the total
	}
	/**
	 * Method that returns the string transaction at that time 
	 * @return the variable transaction
	 */
	public String toString ()
	{
		return transaction;					//returns the transaction string
	}
	/**
	 * Method that resets the value of total back to 0 and 
	 * transaction back to ""
	 */
	public void clear()
	{										//resets the total variable to 0 and the transaction variable to ""
		total = 0;
		transaction = "";
	}
}
