/**
 * This class creats & uses instances of the Item & SmallBag classes.
 * 
 * @author Chris Myhre
 * @version 1.0 (CS-215 Module 0 Assignment 0.1)
 * Fall 2023 (08/24/2023)
 */
public class Application {
	public static void main(String[]args) {
		Item<String> item1 = new Item<String>();
		item1.setE("Chris Myhre");
		
		Item<Integer> item2 = new Item<Integer>();
		item2.setE(0);
		
		SmallBag<Item> item3 = new SmallBag<Item>();
		item3.setItem(item1);
		System.out.println(item1.getE());
		
		item3.setItem(item2);
		System.out.println(item2.getE());
		
	}//end main()
}//end Application class
