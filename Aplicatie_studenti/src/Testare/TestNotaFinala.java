package Testare;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import Studenti.Secretara;
import Studenti.Student;
import Studenti.Materie;

class TestNotaFinala {

    @Test
    void testAtribuieMaterie() {
        // Setup
        Student student = new Student("Elena", "Voinea", "elena.voinea@email.ro", "securepass", "A2");
        Materie isp = new Materie("isp", null);
        Secretara secretara = new Secretara("Ana", "Popescu", "ana.popescu@email.ro", "password123");

        // Action: Assign a new grade
        secretara.atribuieMaterie(student, isp, 9);

        // Assertion: Check if the grade is added correctly
        assertTrue(student.getSituatie().containsKey(isp), "Materie should be added to situatie.");
        assertEquals(9, student.getSituatie().get(isp), "The grade should be 9.");

        // Action: Modify the grade
        secretara.atribuieMaterie(student, isp, 10);

        // Assertion: Check if the grade is updated correctly
        assertEquals(10, student.getSituatie().get(isp), "The grade should be updated to 10.");
    }
}

