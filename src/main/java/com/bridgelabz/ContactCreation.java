package com.bridgelabz;
import java.util.*;
import java.util.stream.Collectors;

public class ContactCreation {
    public void MultipleAddressBook() {
    }

    public class ContactCreation {
        static Scanner scanner = new Scanner(System.in);
        Map<String, List<ContactInfo>> addressBooks = new HashMap<>();

        protected void MultipleAddressBook() {
            try {
                while (true) {
                    System.out.println("What would you like to do? \n" +
                            "1. Crate new address book \n" +
                            "2. Continue with existing address book \n" +
                            "3. All books \n" +
                            "0. EXIT");
                    int choice = scanner.nextInt();
                    switch (choice) {
                        case 1:
                            System.out.println("Enter name for Address book");
                            String newBookName = scanner.next();
                            List<ContactInfo> contactList = new LinkedList<>();
                            if (addressBooks.containsKey(newBookName))
                                System.out.println("Book already exists");
                            else
                                MultipleContact(contactList, addressBooks, newBookName);
                            break;
                        case 2:
                            System.out.println(addressBooks.keySet());
                            System.out.println("Which address book do you want to access?");
                            String existingBook = scanner.next();
                            if (addressBooks.containsKey(existingBook)) {
                                contactList = addressBooks.get(existingBook);
                                MultipleContact(contactList, addressBooks, existingBook);
                            } else
                                System.out.println("Book not found");
                            break;
                        case 3:
                            int serialNo = 1;
                            for (String book : addressBooks.keySet()) {
                                System.out.println(serialNo + ". " + book);
                                serialNo++;
                            }
                            System.out.println("\n" + addressBooks);
                            break;
                        default:
                            System.exit(0);
                    }
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}


