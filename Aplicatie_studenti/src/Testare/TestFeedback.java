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
        // Setup
        Student student = new Student("John", "Doe", "john.doe@example.com", "password123", "A1");
        Profesor profesor = new Profesor("Jane", "Smith", "jane.smith@example.com", "password123", null);
        Feedback feedback = new Feedback("This is a feedback message.", student, profesor);

        // Action
        feedback.trimiteFeedback();

        // Assertion
        String expectedOutput = "Feedback trimis: This is a feedback message." + System.lineSeparator();
        assertEquals(expectedOutput, outContent.toString(),
                     "The feedback message should be printed to the console.");
    }

    @Test
    void testRaspundeLaFeedback() {
        // Setup
        Student student = new Student("John", "Doe", "john.doe@example.com", "password123", "A1");
        Profesor profesor = new Profesor("Jane", "Smith", "jane.smith@example.com", "password123", null);
        Feedback feedback = new Feedback("This is a feedback message.", student, profesor);

        // Action
        feedback.raspundeLaFeedback("Thank you for your feedback.");

        // Assertion
        String expectedOutput = "Răspunsul profesorului: Thank you for your feedback." + System.lineSeparator();
        assertEquals(expectedOutput, outContent.toString(),
                     "The response message should be printed to the console.");
    }
}

