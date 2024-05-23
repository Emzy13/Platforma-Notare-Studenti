package Testare;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import Studenti.Secretara;
import Studenti.Student;
import Studenti.Materie;

class TestNotaFinala {

    @Test
    void testAtribuieMaterie() {

        Student student = new Student("Elena", "Voinea", "elena.voinea@email.ro", "securepass", "A2");
        Materie isp = new Materie("isp", null);
        Secretara secretara = new Secretara("Ana", "Popescu", "ana.popescu@email.ro", "password123");

        secretara.atribuieMaterie(student, isp, 9);

        assertTrue(student.getSituatie().containsKey(isp), "Materie adaugata la situatie.");
        assertEquals(9, student.getSituatie().get(isp), "Nota trebuie sa fie 9.");

        secretara.atribuieMaterie(student, isp, 10);

        assertEquals(10, student.getSituatie().get(isp), "Nota trebuie sa fie 10.");
    }
}

