package OOP_Lesson_5_HW_1;

import java.io.*;
import java.util.*;
public class PhoneBook {
    private List<Contact> contacts;

    public PhoneBook() {
        this.contacts = new ArrayList<>();
    }

    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    public void exportToTextFile(String filename) {
        try (PrintWriter writer = new PrintWriter(filename)) {
            for (Contact contact : contacts) {
                writer.println(contact.getName());
                writer.println(contact.getPhoneNumber());
                writer.println(); // разделитель
            }
            System.out.println("Данные успешно экспортированы в файл " + filename);
        } catch (IOException e) {
            System.out.println("Ошибка при экспорте данных в файл " + filename);
        }
    }

    public void importFromTextFile(String filename) {
        try (Scanner scanner = new Scanner(new File(filename))) {
            while (scanner.hasNext()) {
                String name = scanner.nextLine();
                String phoneNumber = scanner.nextLine();

                contacts.add(new Contact(name, phoneNumber));

                if (scanner.hasNextLine()) {
                    scanner.nextLine(); // пропустить разделитель
                }
            }
            System.out.println("Данные успешно импортированы из файла " + filename);
        } catch (FileNotFoundException e) {
            System.out.println("Файл " + filename + " не найден");
        }
    }

    public void printContacts() {
        for (Contact contact : contacts) {
            System.out.println(contact);
        }
    }
}
