package ps.iv;

import java.util.Comparator;

public class CityComparator implements Comparator<Contact> {

  /*
   * We are using the same implementation as we used in out compareaTo method on
   * Contact.java.
   * The only difference is that here we have contact1 instead of 'this' and
   * we are using 'city' field instead of the 'name' field 
   */
  @Override
  public int compare(Contact contact1, Contact contact2) {
    int contact1Length = contact1.getCity().length();
    int thatLength = contact2.getCity().length();
    int minimumLength = Math.min(contact1Length, thatLength);
    char contact1CityChars[] = contact1.getCity().toCharArray();
    char contact2CityChars[] = contact2.getCity().toCharArray();

    int charIndex = 0;
    while (charIndex < minimumLength) {
        char contact1Char = contact1CityChars[charIndex];
        char contact2Char = contact2CityChars[charIndex];
        if (contact1Char != contact2Char) {
            return contact1Char - contact2Char;
        }
        charIndex++;
    }
    return contact1Length - thatLength;
  }
}