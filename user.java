import java.util.*;

/**A custom class that represents a user object.
 * 
 * Stores all information needed for a user.
 *
 */

public class User {
    String myFirstname;
    String myLastname;
    String myAddress;
    String myEmail;

    /**Returns the firstname of the user
	 * 
	 * @return myFirstname - the first name of the User
	 */
	public String getFirstname(){
		return myFirstname;
	}

    /**Returns the lastname of the user
	 * 
	 * @return myLastname - the first name of the User
	 */
	public String getLastname(){
		return myLastname;
	}

    /**Returns the address of the user
	 * 
	 * @return myAddress - the first name of the User
	 */
	public String getAddress(){
		return myAddress;
	}

        /**Returns the firstname of the user
	 * 
	 * @return myFirstname - the first name of the User
	 */
	public String getEmail(){
		return myEmail;
	}
 
}
