import java.util.*;

class Contact {
    String name, phone, email;

    Contact(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }
}

public class AddressBook {
    static ArrayList<Contact> contacts = new ArrayList<>();
    static HashMap<String, Contact> map = new HashMap<>();
    static HashSet<String> phones = new HashSet<>();

    static void addContact(String name, String phone, String email) {
        if (phones.contains(phone)) {
            System.out.println("Duplicate phone number!");
            return;
        }

        Contact c = new Contact(name, phone, email);
        contacts.add(c);
        map.put(name, c);
        phones.add(phone);
    }

    static void search(String name) {
        if (map.containsKey(name)) {
            Contact c = map.get(name);
            System.out.println(c.name + " " + c.phone + " " + c.email);
        } else {
            System.out.println("Contact not found");
        }
    }

    static void delete(String name) {
        Contact c = map.remove(name);

        if (c != null) {
            contacts.remove(c);
            phones.remove(c.phone);
            System.out.println("Deleted");
        }
    }

    static void display() {
        Collections.sort(contacts, (a, b) -> a.name.compareTo(b.name));

        for (Contact c : contacts)
            System.out.println(c.name + " " + c.phone + " " + c.email);
    }

    public static void main(String[] args) {
        addContact("Ankush", "9999", "a@gmail.com");
        addContact("Riya", "8888", "r@gmail.com");
        addContact("Ankush2", "9999", "x@gmail.com");

        search("Riya");
        delete("Ankush");
        display();
    }
}
