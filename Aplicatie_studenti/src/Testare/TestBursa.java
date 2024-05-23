package Testare;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import Studenti.Bursa;
import Studenti.Student;
import Studenti.Materie;

class TestBursa {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));  // Redirect System.out to capture the output
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);  // Restore System.out to its original state
    }

    @Test
    void testVerificaEligibilitatea() {
        // Setup
        Student student = new Student("John", "Doe", "john.doe@example.com", "password123", "A1");
        student.getSituatie().put(new Materie("Matematica", null), 10);  // Ensure grade is high enough for "Bursa de performanta"
        student.getSituatie().put(new Materie("Fizica", null), 9);  // Additional grade to maintain average above 9.5

        Bursa bursa = new Bursa(student);

        // Action
        bursa.verificaEligibilitatea();

        // Assertion
        String expectedOutput = "Eligibilitate pentru bursă: Bursa de performanta" + System.lineSeparator();
        assertEquals(expectedOutput, outContent.toString(),
                     "The eligibility message should be printed to the console indicating a performance scholarship.");
    }
}

