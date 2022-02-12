package application;

public class Fox {
 /* Every class in Java derives from the Object superclass.
  * Object has a default toString() method that the subclasses
  * inherit.
  */
	public String name;
	
	public Fox() {
		System.out.println(this);
		this.name = "Ferdinald";
	}
	
	/* this is a reference to the object within the class.
	 * it puts out the hashcode of the object.  So for name,
	 * you need this.name in order to refer to it within the 
	 * class.  In the App class, you use fox.name, since fox is
	 * the object (IOW, it's an external reference).
	 */
}
