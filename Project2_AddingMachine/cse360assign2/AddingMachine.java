package cse360assign2;

/**
 * AddingMachine ---- class that acts as a simple calculator
 * 		while keeping a history of the transactions and returned as a string
 * @author  Larissa Pokam Epse Takou Kuitche
 * CSE 360, Summer 2019
 * Assignment 2
 * 06 - 11 - 2019
 */


public class AddingMachine {

	/**
	 * Represents the total used in all operation
	 */
	
	private int total;
	
	
	/**
	 * uses to record history of all operation
	 */
	
	private String history = "";
	
	
	/**
	 * Class constructor.
	 * @param no parameter value.
	 */
	
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
		history = history + total;
	}
	
	
	/**
	 * getTotal method that allow to obtain the current total.
	 * @param No parameter value.
	 * @return an integer representing the current total.
	 */
	
	public int getTotal () {
		return total;
	}
	
	
	/**
	 * The add method that add the given parameter value to the total variable
	 * @param  value represents the value to be added to the current total.
	 * @return No parameter value.
	 */
	
	public void add (int value) {
		total = total + value;
		history = history + " + " + value;
	}
	
	
	/**
	 * The subtract method subtracts the parameter from the total variable.
	 * @param  value represents the value to be subtracted from the total.
	 * @return No parameter value.
	 */
	
	public void subtract (int value) {
		total = total - value;
		history = history + " - " + value;
	}
	
	
	/**
	 * The toString keep a history of the transactions. 
	 * @param  No parameter value.
	 * @return string representing the history of the transactions kept.
	 */
	
	public String toString () {
		return history;
	}


	/**
	 * The clear method erased a history of the transactions. 
	 * @param  No parameter value.
	 * @return No parameter value.
	 */
	
	public void clear() {
	
	}
}
