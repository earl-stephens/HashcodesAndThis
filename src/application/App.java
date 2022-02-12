package application;

public class App {

	public static void main(String[] args) {
		Fox fox = new Fox();
		
		System.out.println(fox);
		/* this returns application.Fox@4b1210ee
		 * package application
		 * Class Fox
		 * @4b1210ee is the hashcode in hex
		 * hashcode is unique to the object, but is not
		 * a memory address
		 */
		
		System.out.println(fox.hashCode());
		/* returns hashcode
		 */
		
		System.out.printf("%x\n", fox.hashCode());
		/* returns the hex version of the hashcode
		 */

		System.out.println(fox.name);
	}

}
