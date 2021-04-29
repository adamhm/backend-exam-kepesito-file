package hu.nive.ujratervezes.io.phonebook;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

public class Phonebook {
    public void exportPhonebook(Map<String, String> contacts, String output) {
        if (contacts == null || output == null) {
            throw new IllegalArgumentException();
        }
        
        try (PrintWriter writer = new PrintWriter(output)) {
            contacts.forEach((name, phoneNumber) -> writer.printf("%s: %s%n", name, phoneNumber));
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
