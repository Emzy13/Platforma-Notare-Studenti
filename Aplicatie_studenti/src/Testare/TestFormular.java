package Testare;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import Studenti.Student;

class TestFormular {

    @Test
    void testCompleteazaFormular() {
        String input = "1\nJohn Doe\n1234567890\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Student student = new Student("John", "Doe", "john.doe@example.com", "password123", "A1");
        student.completeazaFormular();

        String expectedOutput = "Alege tipul de formular:\n" +
                                "1. Formular camin\n" +
                                "2. Plata restanta\n" +
                                "3. Adeverinta\n" +
                                "Introduceti numarul corespunzator formularului dorit: Introdu numele si prenumele: Introdu numarul de telefon: Formular camin completat pentru John Doe cu telefon 1234567890";
        String actualOutput = outContent.toString().replace("\r\n", "\n").trim();

        assertEquals(expectedOutput, actualOutput);

        System.setIn(System.in);
        System.setOut(System.out);
    }
}

