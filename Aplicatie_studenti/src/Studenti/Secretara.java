package Studenti;

public class Secretara extends Persoana{
	
	 public Secretara(String nume, String prenume, String email, String parola) {
		super(nume, prenume, email, parola);
	}

	public void introduceNote(Student student, Materie materia, double nota) {
	        // Presupunând că Medie gestionează sistemul de notare
	        materia.getMedie().updateazaNota(student, nota);
	        System.out.println("Notă introdusă pentru " + student.getNume() + " la " + materia.getNume());
	    }
}
