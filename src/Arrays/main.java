package Arrays;//        System.out.println("Enter the length of array");
//        Arr.printInteger(Arr.sortInteger(Arr.getInteger()));
//        int count =scanner.nextInt();
//        System.out.println(Arrays.Arraey.findminelementofthearray(Arrays.Arraey.readIntegers(count)));
//        Arrays.Arraey.printInteger( Arrays.Arraey.revarray( Arrays.Arraey.getInteger()));

import Arrays.ArreyList;

import java.util.Scanner;

public class main {

    private static ArreyList.MobilePhone mobilePhone = new ArreyList.MobilePhone("9031446811");


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        System.out.println("Starting the Phone.... ");
        int choice = 0;
        printinstructions();
        while (!quit) {
            System.out.println("Enter Your Choice");
            choice = scanner.nextInt();
            switch (choice) {
                case 0:
                    printinstructions();
                    break;
                case 1:
                    showcontact();
                    break;
                case 2:
                    addtocontact();
                    break;
                case 3:
                    modifycontactlist();
                    break;
                case 4:
                    searchcontactlist();
                    break;
                case 5:
                    deletecontactlist();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }
    }

    private static void printinstructions() {
        System.out.println("\nPress");
        System.out.println("\n0 - Reboot the Phone");
        System.out.println("\n1 - Show Contact Lists");
        System.out.println("\n2 - Add to Contacts");
        System.out.println("\n3 - Modify Contact List");
        System.out.println("\n4 - Search Contact");
        System.out.println("\n5 - Delete Contact");
        System.out.println("\n6 - Shutdown");
    }

    private static void showcontact() {
        mobilePhone.show_allcontacts();
    }

    private static void addtocontact() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the contact name..");
        String name = scanner.nextLine();
        if (mobilePhone.query_Contact(name) == null) {
            System.out.println("Enter the contact no..");
            String phone = scanner.nextLine();
            if (mobilePhone.create_contact(ArreyList.Contacts.createContact(name, phone))) {
                System.out.println("New Contact Created with name " + name);
            } else {
                System.out.println("Not able to create Contact Memory Full");
            }
        } else {
            System.out.println("Contact Already Exists");
        }
    }

    private static void modifycontactlist() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the contact name to modify..");
        String name = scanner.nextLine();
        if (mobilePhone.query_Contact(name) == null) {
            System.out.println("Contact not found");
        } else {
            System.out.println("Enter the new contact name..");
            String newname = scanner.nextLine();
            System.out.println("Enter the contact name no..");
            String newno = scanner.nextLine();
            ArreyList.Contacts oldcontact = mobilePhone.query_Contact(name);
            ArreyList.Contacts newcontact = ArreyList.Contacts.createContact(newname, newno);
            if (mobilePhone.modify_contacts(oldcontact, newcontact)) {
                System.out.println("Contact sucessfully modified");
            } else {
                System.out.println("Contact wasn't modified");
            }
        }
    }

    private static void searchcontactlist() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name of contact to search");
        String name = scanner.nextLine();
        if (mobilePhone.query_Contact(name) != null) {
            System.out.println(mobilePhone.query_Contact(name).Contact_names + " --> " + mobilePhone.query_Contact(name).Contact_nos);
        } else {
            System.out.println("No contact found with that name");
        }
    }

    private static void deletecontactlist() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name of contact to delete");
        String name = scanner.nextLine();
        if (mobilePhone.query_Contact(name) != null) {
            System.out.println(mobilePhone.query_Contact(name).Contact_names + " --> " + mobilePhone.query_Contact(name).Contact_nos);
            System.out.println("Are you sure you want to delete 0 for no|1 for yes");
            int answer = scanner.nextInt();
            if (answer == 1) {
                mobilePhone.remove_contact(mobilePhone.query_Contact(name));
            } else {
                System.out.println("Aborted");
            }
        } else {
            System.out.println("No contact found with that name");
        }
    }


}
