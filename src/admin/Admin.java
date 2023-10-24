package admin;

public class Admin {

    private static Admin single_instance = null;

    public static Admin getInstance()
    {
        if (single_instance == null)
            single_instance = new Admin();

        return single_instance;
    }


    private String userName;
    private String firstName;
    private String lastName;
    private String email;
    private long phoneNumber;
    private String password;



    private Admin()
    {
        this.userName = "admin";
        this.password = "admin";
        this.firstName = "null";
        this.lastName = "null";
        this.email = "null";
        this.phoneNumber = 0;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Admin{" +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}

