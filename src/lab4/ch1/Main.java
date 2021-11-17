package lab4.ch1;

import java.io.*;

public class Main {
    public static void storeContactToFile(String fileName, Contact contact) {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName));
            bufferedWriter.write(contact.toString());
            if(bufferedWriter != null)
                bufferedWriter.close();
        } catch(Exception ex){
            ex.printStackTrace();
        } finally {
        }
    }

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook("./src/lab4/ch1/in.txt");
        System.out.println(phoneBook.findContact("Abbeey"));
        storeContactToFile("./src/lab4/io/foundContacts.txt", phoneBook.findContact("Abbey"));
    }
}
