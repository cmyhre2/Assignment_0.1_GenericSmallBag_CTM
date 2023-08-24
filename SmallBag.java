/**
 * This class creates & manages SmallBag class objects.
 * 
 * @author Chris Myhre
 * @version 1.0 (CS-215 Module 0 Assignment 0.1)
 * Fall 2023 (08/24/2023)
 */
public class SmallBag<T> {
	private T item;//Type T variable item stores data of a specified type.
	
	/**
	 * Getter for item
	 * @return item
	 */
	public T getItem() {
		return item;
	}//end getItem()
	
	/**
	 * Setter for item
	 * @param data
	 */
	public void setItem(T data) {
		item = data;
	}//end setItem()
}//end SmallBag class
