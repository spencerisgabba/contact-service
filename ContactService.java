import java.util.HashMap;
import java.util.Map;

public class ContactService {
    private final Map<String, Contact> contacts;

    public ContactService() {
        this.contacts = new HashMap<>();
    }

    public boolean addContact(Contact contact) {
        if (contacts.containsKey(contact.getContactID())) {
            return false; 
        }
        contacts.put(contact.getContactID(), contact);
        return true;
    }

    public boolean deleteContact(String contactID) {
        if (!contacts.containsKey(contactID)) {
            return false;
        }
        contacts.remove(contactID);
        return true;
    }

    public boolean updateContactField(String contactID, String field, String value) {
        if (!contacts.containsKey(contactID)) {
            return false;
        }

        Contact contact = contacts.get(contactID);
        switch (field) {
            case "firstName":
                contact.setFirstName(value);
                break;
            case "lastName":
                contact.setLastName(value);
                break;
            case "phone":
                contact.setPhone(value);
                break;
            case "address":
                contact.setAddress(value);
                break;
            default:
                return false;
        }
        return true;
    }
}
