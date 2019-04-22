package ps.iv;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class AddressBook {
  
  private Set<Contact> contacts;
  private List<Contact> contactList;
  
  public void populateAddressBook() {
    // Create some Contacts
    Contact andy = new Contact("pandidurai", "madurai");
    Contact andy1 = new Contact("Pandidurai", "madurai");
    Contact bunny = new Contact("ShanthaSheela", "trichy");
    Contact clair = new Contact("clair", "london");
    Contact danny = new Contact("danny", "chicago");
    Contact alex = new Contact("Alex", "mexico");
    Contact petra = new Contact("petra", "utrecht");
    Contact mike = new Contact("mike", "delhi");
    Contact andrew = new Contact("andrew", "mesopotamia");
    
    // Add Contacts to the address book
    contacts = new TreeSet<>(Arrays.asList(
        andy, andy1, bunny, clair, danny, alex, petra, mike, andrew));
    
    contactList = Arrays.asList(andy, andy1, bunny, clair, danny, alex, petra, mike, andrew);
  }

  public Set<Contact> getContacts() {
    return contacts;
  }
  
  public List<Contact> getContactList() {
	    return contactList;
	  }
}
