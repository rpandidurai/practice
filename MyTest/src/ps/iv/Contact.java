/**
 * 
 */
package ps.iv;

/**
 * @author e3025685
 *
 */
public class Contact implements Comparable<Contact> {
	  // Instead of FirstName & LastName, let's use name for simplicity.
	  private String name;
	  private String city;
	  
	  public Contact(String name, String city) {
	    this.name = name;
	    this.city = city;
	  }
	  
	  public Contact()
	  {
		  
	  }

	 /* @Override
	  public int compareTo(Contact contact) {
	    int thisLength = this.name.length();
	    int thatLength = contact.name.length();
	    int minimumLength = Math.min(thisLength, thatLength);
	    char thisNameChars[] = this.name.toCharArray();
	    char thatNameChars[] = contact.name.toCharArray();

	    int charIndex = 0;
	    while (charIndex < minimumLength) {
	        char thisChar = thisNameChars[charIndex];
	        char thatChar = thatNameChars[charIndex];
	        if (thisChar != thatChar) {
	            return thisChar - thatChar;
	        }
	        charIndex++;
	    }
	    return thisLength - thatLength;
	  }
	  */
	  @Override
	  public int compareTo(Contact contact) {
		  return this.getName().compareToIgnoreCase(contact.getName());
	  }

	  public String getName() {
	    return name;
	  }

	  public String getCity() {
	    return city;
	  }

	  @Override
	  public String toString() {
	    return "{ name=" + name + ", city=" + city + " }";
	  }
	}
