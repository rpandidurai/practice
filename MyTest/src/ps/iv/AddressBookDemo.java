package ps.iv;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class AddressBookDemo {

  public static void main(String[] args) 
  {
    // To start the demo, first of all we need an Address book
    AddressBook addressBook = new AddressBook();
    // We need some addresses in the AddressBook for it to be useful
    addressBook.populateAddressBook();
    // Let's see our contacts
    Set<Contact> contacts = addressBook.getContacts();
    List<Contact> contactList = addressBook.getContactList();
    System.out.println(contacts.size());
    System.out.println(contacts);
    // Now we need to see our contacts sorted by city, which is a change in requirement
    // So, let's just use our city comparator and sort the address
    Set<Contact> contactsSortedByCity = new TreeSet<>(new CityComparator());
    contactsSortedByCity.addAll(contacts);
    
    System.out.println(contactsSortedByCity);
    
    //    System.out.println(contactList.size());
    //    System.out.println(contactList);
    //    System.out.println(contactList);
    //    contactList.sort(new CityComparator());
    //    System.out.println("List city \n"+contactList);
  }
}



// ============ Output ================

       // Sorted by Name       

// [{ name=alex, city=mexico }, { name=andrew, city=mesopotamia }, { name=andy, city=mumbai }, { name=bunny, city=amsterdam }, { name=clair, city=london }, { name=danny, city=chicago }, { name=mike, city=delhi }, { name=petra, city=utrecht }]

       // Sorted by City  

// [{ name=bunny, city=amsterdam }, { name=danny, city=chicago }, { name=mike, city=delhi }, { name=clair, city=london }, { name=andrew, city=mesopotamia }, { name=alex, city=mexico }, { name=andy, city=mumbai }, { name=petra, city=utrecht }]
