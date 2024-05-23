package Testare;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import Studenti.Feedback;
import Studenti.Student;
import Studenti.Profesor;

class TestFeedback {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    void testTrimiteFeedback() {

        Student student = new Student("John", "Doe", "john.doe@example.com", "password123", "A1");
        Profesor profesor = new Profesor("Jane", "Smith", "jane.smith@example.com", "password123", null);
        Feedback feedback = new Feedback("Mesaj de feedback.", student, profesor);

        feedback.trimiteFeedback();

        String expectedOutput = "Feedback trimis: Mesaj de feedback." + System.lineSeparator();
        assertEquals(expectedOutput, outContent.toString(),
                     "mesaj de feedback.");
    }

    @Test
    void testRaspundeLaFeedback() {

        Student student = new Student("John", "Doe", "john.doe@example.com", "password123", "A1");
        Profesor profesor = new Profesor("Jane", "Smith", "jane.smith@example.com", "password123", null);
        Feedback feedback = new Feedback("Mesaj de feedback.", student, profesor);

        feedback.raspundeLaFeedback("Multumesc pentru feedback.");

        String expectedOutput = "Răspunsul profesorului: Multumesc pentru feedback." + System.lineSeparator();
        assertEquals(expectedOutput, outContent.toString(),
                     "Multumesc pentru feedback.");
    }
}

