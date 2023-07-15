package OOP_Lesson_5_HW_1;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        Contact contact1 = new Contact("Иван", "123456789");
        Contact contact2 = new Contact("Петр", "987654321");

        phoneBook.addContact(contact1);
        phoneBook.addContact(contact2);

        phoneBook.exportToTextFile("phonebook.txt");

        phoneBook.printContacts();

        PhoneBook newPhoneBook = new PhoneBook();
        newPhoneBook.importFromTextFile("phonebook.txt");

        newPhoneBook.printContacts();
    }
}
