/**
 * This class creates & manages Item class objects.
 * 
 * @author Chris Myhre
 * @version 1.0 (CS-215 Module 0 Assignment 0.1)
 * Fall 2023 (08/24/2023)
 */

public class Item<T> {
	private T e;//Type T variable e stores data of a specified type.
	
	/**
	 * Getter for value
	 * @return value
	 */
	public T getE() {
		return e;
	}//end getE()
	
	/**
	 * Setter for e
	 * @param data
	 */
	public void setE(T data){
		e = data;
	}//end setE()
}//end Item class
