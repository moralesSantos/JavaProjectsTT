public class Entry {

    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String emailAddress;

    public Entry(){
    }

    public Entry(String fName, String lName, String number, String email){
        this.firstName = fName;
        this.lastName = lName;
        this.phoneNumber = number;
        this.emailAddress=email;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public String toString() {
        return "Entry{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                '}';
    }

    public static void main(String[] args) {
        //test run new entry
        Entry newEntry = new Entry("Max","Chewning","3367202020","0max@google.com");
        System.out.println(newEntry.getFirstName());
        System.out.println(newEntry.getLastName());
        System.out.println(newEntry.getPhoneNumber());
        System.out.println(newEntry.getEmailAddress());
    }



}
