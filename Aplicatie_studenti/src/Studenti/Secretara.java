package Studenti;

import java.util.*;

public class Secretara extends Persoana{
	 public Secretara(String nume, String prenume, String email, String parola) {
	        super(nume, prenume, email, parola);
	    }

	    // Metodă pentru a atribui o materie și media aferentă unui student
	    public void atribuieMaterie(Student student, Materie materie, int media) {
	        student.getSituatie().put(materie, media);
	    }

	    // Metodă pentru a modifica nota unei materii pentru un student
	    public void modificaNota(Student student, Materie materie, int nouaNota) {
	        if (student.getSituatie().containsKey(materie)) {
	            student.getSituatie().put(materie, nouaNota);
	        } else {
	            System.out.println("Materie inexistenta: " + materie.getNumeMaterie());
	        }
	    }

	    // Metodă pentru a atribui o materie unui profesor
	    public void atribuieMaterieProfesor(Profesor profesor, Materie materie) {
	        profesor.setMaterie(materie);
	    }
	    public void afiseazaRaportMaterii(List<Materie> materii) {
	        Rapoarte rapoarte = new Rapoarte();
	        rapoarte.genereazaRaportMaterii(materii);
	    }

	    public void afiseazaRaportProfesori(List<Profesor> profesori) {
	        Rapoarte rapoarte = new Rapoarte();
	        rapoarte.genereazaRaportProfesori(profesori);
	    }

	    public void afiseazaRaportFinal(List<Student> studenti) {
	        Rapoarte rapoarte = new Rapoarte();
	        rapoarte.genereazaRaportFinal(studenti);
	    }
}
