import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.ArrayList;

public class main {
    public static void main(String[] args) {

        int choice = 0;
        String firstName;
        String lastName;
        String phoneNumber;
        String emailAddress;

        Library addressBook1 = new Library();

        //addressBook1.addEntry(new Entry(firstName, lastName, phoneNumber, emailAddress));
        Scanner input = new Scanner(System.in);


        addressBook1.addEntry(new Entry("Naruto","Uzumaki","0000000000","naruto@gmail.com"));
        addressBook1.addEntry(new Entry("Sasuke","Uchiha","1111111111","sasuke@gmail.com"));
        addressBook1.addEntry(new Entry("Kakashi","Hatake","3333333333","kakashi@gmail.com"));

        System.out.println("Choose an Option");
        System.out.println("1) Add an entry");
        System.out.println("2) Remove an entry");
        System.out.println("3) Search for specific entry");
        System.out.println("4) Print Address Book");
        System.out.println("5) Delete Book");
        System.out.println("6) Quit");



        boolean validInput = false;
        boolean quit = false;

        do {
            System.out.println("Please choose what you'd like to do with the database (Enter any other # for options): ");
            if (input.hasNextInt()) {
                choice = input.nextInt();
            } else {
                System.out.println("Enter a number next time");
                break;
            }
            //       System.out.println("Please choose what you'd like to do with the database (Enter 0 for options): ");

            //choice = input.nextInt();

            switch (choice) {
                case 1:
                    //Add an entry
                    System.out.println("First Name: ");
                    firstName = input.next();
                    System.out.println("Last Name: ");
                    lastName = input.next();
                    System.out.println("Phone number: ");
                    phoneNumber= input.next();
                    System.out.println("Email address: ");
                    emailAddress= input.next();

                    if(addressBook1.containsEmail(emailAddress)){
                        do {
                            System.out.println("Enter new email address: Cannot enter same email");
                            emailAddress = input.next();
                        } while (addressBook1.containsEmail(emailAddress));
                    }
//                    if(addressBook1.containsEmail(emailAddress)){
//                        System.out.println("Enter new email address: Cannot enter same email");
//                        emailAddress = input.next();
//                        if (addressBook1.containsEmail(emailAddress)){
//                            System.out.println("Enter new email address: Cannot enter same email");
//                            emailAddress = input.next();
//                        }
//                    }

                    addressBook1.addEntry(new Entry(firstName, lastName, phoneNumber, emailAddress));
                    System.out.println("Added new entry!");
                    break;
                case 2:
                    //Remove an entry
                    String emailToRemove;
                    System.out.println("Enter an entry's email to remove: ");
                    emailToRemove = input.next();
                    //System.out.println(emailToRemove);
                    addressBook1.deleteEntries(emailToRemove);
                    break;
                case 3:
                    //Search for specific entry
                    int option;
                    String search;
                    System.out.println("1) First Name \n 2) Last Name \n 3) Phone Number \n 4) Email Address ");
                    System.out.println("Chose a search type: ");
                    option = input.nextInt();
                    System.out.println("Enter your search: ");
                    search = input.next();

                    addressBook1.searchEntry(option,search);

                    System.out.println("Done with searching");
                    break;
                case 4:
                    //Print Address Book
                    addressBook1.printEntries();
                    break;
                case 5:
                    //Delete book
                    addressBook1.deleteBook();
                    break;
                case 6:
                    //quit
                    System.out.println("QUIT");
                    quit=true;
                    break;
                default:
                    System.out.println("Choose an Option");
                    System.out.println("1) Add an entry");
                    System.out.println("2) Remove an entry");
                    System.out.println("3) Search for specific entry");
                    System.out.println("4) Print Address Book");
                    System.out.println("5) Delete Book");
                    System.out.println("6) Quit");
            }

        } while (!quit) ;

    }

}