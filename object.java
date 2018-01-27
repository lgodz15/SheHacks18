import java.util.*;

/**A custom class that represents an object.
 * 
 * Stores all information needed for an object.
 *
 */

public class Object {
    String myName;
    String myCategory;
    Bool myAvailability;

    /**Returns the name of the object
	 * 
	 * @return myName - the name of the Object
	 */
	public String getName(){
		return myName;
	}

    /**Returns the category of the object
	 * 
	 * @return myCategory - the category of the Object
	 */
	public String getCategory(){
		return myCategory;
	}

    /**Returns the name of the object
	 * 
	 * @return myAvailability - the availability of the Object
	 */
	public Bool getAvailability(){
		return myAvailability;
	}
}
