public class Contact {
    private String contactID;
    private String firstName;
    private String lastName;
    private String phone;
    private String address;

    
    //Create new contact with errors and exceptions
    public Contact(String contactID, String firstName, String lastName, String phone, String address) {
        if (contactID == null || contactID.length() > 10) {
            throw new IllegalArgumentException("Contact ID must not be null and cannot exceed 10 characters");
        }
        this.contactID = contactID;

        if (firstName == null || firstName.length() > 10) {
            throw new IllegalArgumentException("First Name must not be null and cannot exceed 10 characters");
        }
        this.firstName = firstName;

        if (lastName == null || lastName.length() > 10) {
            throw new IllegalArgumentException("Last Name must not be null and cannot exceed 10 characters");
        }
        this.lastName = lastName;

        if (phone == null || phone.length() != 10 || !phone.matches("\\d+")) {
            throw new IllegalArgumentException("Phone must be exactly 10 digits and cannot be null");
        }
        this.phone = phone;

        if (address == null || address.length() > 30) {
            throw new IllegalArgumentException("Address must not be null and cannot exceed 30 characters");
        }
        this.address = address;
    }

    
    //Getters and Setters
    public String getContactID() {
        return contactID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}