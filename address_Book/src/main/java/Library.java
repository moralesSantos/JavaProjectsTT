import java.util.ArrayList;

public class Library extends Entry {

    private ArrayList<Entry> entryList = new ArrayList<>();

    public void addEntry(Entry entry) {
        this.entryList.add(entry);
    }

    public boolean containsEmail(String email) {
        for (Entry e : this.entryList) {
            if (e.getEmailAddress().equalsIgnoreCase(email)) {
                return true;
            }
        }  return false;

    }

    public void printEntries() {

        if (this.entryList.isEmpty()) {
            System.out.println("There is no entries in this address book");
        }
        for (Entry e : this.entryList) {
            System.out.println("*******************");
            System.out.println(e.getFirstName());
            System.out.println(e.getLastName());
            System.out.println(e.getPhoneNumber());
            System.out.println(e.getEmailAddress());
            System.out.println("*******************");
            System.out.println("");
        }
    }


    public void deleteEntries(String email) {
        if (this.entryList.isEmpty()) {
            System.out.println("There is no entries in this address book");
        }

        //System.out.println(email);

        if(entryList.removeIf(entry -> entry.getEmailAddress().equals(email))){
            System.out.println(email + " was removed ");
        }

    }


    public void searchEntry(int num, String input) {
        switch (num) {
            case 1:
                for (Entry e : this.entryList) {
                    if (e.getFirstName().equalsIgnoreCase(input)) {
                        System.out.println(e.getFirstName());
                        System.out.println(e.getLastName());
                        System.out.println(e.getPhoneNumber());
                        System.out.println(e.getEmailAddress());
                        System.out.println("");
                    }
                }
                break;
            case 2:
                for (Entry e : this.entryList) {
                    if (e.getLastName().equalsIgnoreCase(input)) {
                        System.out.println(e.getFirstName());
                        System.out.println(e.getLastName());
                        System.out.println(e.getPhoneNumber());
                        System.out.println(e.getEmailAddress());
                        System.out.println("");
                    }
                }
                break;
            case 3:
                for (Entry e : this.entryList) {
                    if (e.getPhoneNumber().equalsIgnoreCase(input)) {
                        System.out.println(e.getFirstName());
                        System.out.println(e.getLastName());
                        System.out.println(e.getPhoneNumber());
                        System.out.println(e.getEmailAddress());
                        System.out.println("");
                    }
                }
                break;
            case 4:
                for (Entry e : this.entryList) {
                    if (e.getEmailAddress().equalsIgnoreCase(input)) {
                        System.out.println(e.getFirstName());
                        System.out.println(e.getLastName());
                        System.out.println(e.getPhoneNumber());
                        System.out.println(e.getEmailAddress());
                        System.out.println("");
                    }
                }
                break;
        }
    }

    public void deleteBook() {
        entryList.clear();
        System.out.println("Address book has been deleted");
    }


    public static void main(String[] args) {
    }
}
