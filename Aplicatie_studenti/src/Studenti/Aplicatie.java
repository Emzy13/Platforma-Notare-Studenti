package Studenti;
import java.util.Arrays;
import java.util.List;

public class Aplicatie {
		public static void main(String[] args) {
			 Profesor prof1 = new Profesor("Ion", "Popescu", "ion.popescu@email.ro", "password123", null);
		        Profesor prof2 = new Profesor("Maria", "Ionescu", "maria.ionescu@email.ro", "password123", null);

		        // Create instances of Materie
		        Materie isp = new Materie("ISP", prof1);
		        Materie am = new Materie("AM", prof2);

		        // Assign Materie to Profesors
		        prof1.setMaterie(isp);
		        prof2.setMaterie(am);

		        // Create instances of Student
		        Student student1 = new Student("Alex", "Muresan", "alex.muresan@email.ro", "password123", "A1");
		        Student student2 = new Student("Elena", "Voinea", "elena.voinea@email.ro", "password123", "A1");

		        // Secretary assigns grades
		        Secretara secretara = new Secretara("Livia", "Barbu", "livia.barbu@email.ro", "password321");
		        secretara.atribuieMaterie(student1, isp, 10);
		        secretara.atribuieMaterie(student1, am, 9);
		        secretara.atribuieMaterie(student2, isp, 8);
		        secretara.atribuieMaterie(student2, am, 7);

		        // Modify a grade
		        secretara.modificaNota(student1, isp, 8);

		        // Students create and print feedback
		        Feedback feedback1 = student1.creeazaFeedback("Very good course", isp);
		        Feedback feedback2 = student2.creeazaFeedback("Needs more examples", am);
		        System.out.println("Feedback 1: " + feedback1.getDetalii() + " from " + feedback1.getStudent().getNume());
		        System.out.println("Feedback 2: " + feedback2.getDetalii() + " from " + feedback2.getStudent().getNume());

		        // Generate and use reports
		        List<Materie> materii = Arrays.asList(isp, am);
		        List<Profesor> profesori = Arrays.asList(prof1, prof2);
		        List<Student> studenti = Arrays.asList(student1, student2);

		        Rapoarte rapoarte = new Rapoarte();
		        secretara.afiseazaRaportMaterii(materii);
		        secretara.afiseazaRaportProfesori(profesori);
		        rapoarte.genereazaRaportFinal(studenti); // Explicitly calling with rapoarte object to utilize it

		        // Check and apply for scholarships
		        student1.aplicarePentruBursa();
		        student2.aplicarePentruBursa();
		    }
}
