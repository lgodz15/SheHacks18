import java.util.*;

/**A custom class that represents a hood object.
 * 
 * Stores all information needed for a hood.
 *
 */

public class Hood {
    String myHoodname;
    User[] myMembers;
    Object[] myObjects;

    /**Returns the hoodname of the hood
	 * 
	 * @return myHoodname - the name of the hood
	 */
	public String getHoodname(){
		return myHoodname;
	}

    /**Returns the members of the hood
	 * 
	 * @return myMembers - the list of members
	 */
	public User[] getMembers(){
		return myMembers;
	}

    /**Returns the objects of the hood
	 * 
	 * @return myObjects - the list of objects
	 */
	public Object[] getObjects(){
		return myObjects;
	}

}
