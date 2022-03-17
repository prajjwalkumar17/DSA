package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArreyList {
    static class MobilePhone {
        public static Scanner sc = new Scanner(System.in);
        private String myno;
        private ArrayList<Contacts> contactsArrayList;

        public MobilePhone(String myno) {
            this.myno = myno;
            this.contactsArrayList = new ArrayList<>();
        }

        public void show_allcontacts() {
            if (this.contactsArrayList.size() > 0) {
                for (int i = 0; i < this.contactsArrayList.size(); i++) {
                    System.out.println((i + 1) + " --> " + this.contactsArrayList.get(i).Contact_names + " " + this.contactsArrayList.get(i).Contact_nos);
                }
            } else {
                System.out.println("No Contacts found Create one to view\n");
            }
        }

        public boolean create_contact(Contacts contacts) {
            if (findcontact(contacts.getContact_names()) >= 0) {
                System.out.println("Contact already present");
                return false;
            }
            contactsArrayList.add(contacts);
            return true;
        }

        public boolean remove_contact(Contacts contacts) {
            if (findcontact(contacts.getContact_names()) < 0) {
                System.out.println("Contact not present");
                return false;
            }
            this.contactsArrayList.remove(findcontact(contacts));
            System.out.println(contacts.Contact_names + " Was successfully removed");
            return true;
        }

        public boolean modify_contacts(Contacts oldcontact, Contacts newcontact) {
            if (findcontact(oldcontact.getContact_names()) < 0) {
                System.out.println(oldcontact.Contact_names + " Contact not present");
                return false;
            }
            this.contactsArrayList.set(findcontact(oldcontact), newcontact);
            System.out.println(oldcontact.Contact_names + " Contact replace with " + newcontact.Contact_names);
            return true;
        }

        public Contacts query_Contact(String name) {
            int position = findcontact(name);
            if (position >= 0) {
                return this.contactsArrayList.get(position);
            }
            return null;
        }

        public String query_Contact(Contacts contacts) {
            if (findcontact(contacts) >= 0) {
                return contacts.getContact_names();
            }
            System.out.println("There  was no Contact present");
            return null;
        }

        private int findcontact(String contact_names) {
            for (int i = 0; i < this.contactsArrayList.size(); i++) {
                if (this.contactsArrayList.get(i).Contact_names == contact_names) {
                    return i;
                }
            }
            return -1;
        }

        private int findcontact(Contacts contacts) {
            return contactsArrayList.indexOf(contacts);
        }
    }

    static class Contacts {
        String Contact_names;
        String Contact_nos;

        public Contacts(String contact_names, String contact_nos) {
            Contact_names = contact_names;
            Contact_nos = contact_nos;
        }

        public static Contacts createContact(String name, String phno) {
            return new Contacts(name, phno);
        }

        public String getContact_names() {
            return Contact_names;
        }

        public String getContact_nos() {
            return Contact_nos;
        }
    }
}
