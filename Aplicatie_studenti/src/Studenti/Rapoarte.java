package Studenti;

import java.util.*;

public class Rapoarte {

	public void genereazaRaportMaterii(List<Materie> materii) {
        for (Materie mat : materii) {
            System.out.println("Raport pentru Materie: " + mat.getNumeMaterie());
            Profesor prof = mat.getProfesor();
            System.out.println("Predată de: " + prof.getNume() + " " + prof.getPrenume());
        }
    }

	public void genereazaRaportProfesori(List<Profesor> profesori) {
        for (Profesor prof : profesori) {
            System.out.println("Raport pentru Profesor: " + prof.getNume() + " " + prof.getPrenume());
            Materie materie = prof.getMaterie();
            if (materie != null) {
                System.out.println("Predă materiile: " + materie.getNumeMaterie()); 
            } else {
                System.out.println("Nu sunt materii atribuite.");
            }
            List<Feedback> feedbackuri = prof.getFeedbackuri();
            System.out.println("Număr feedback-uri: " + feedbackuri.size());
        }
    }

    public void genereazaRaportFinal(List<Student> studenti) {
        System.out.println("Generare raport final comprehensiv.");
        for (Student student : studenti) {
            Map<Materie, Integer> situatie = student.getSituatie();
            System.out.println("Student: " + student.getNume() + " " + student.getPrenume() + " - Grupa: " + student.getGrupa());
            situatie.forEach((materie, nota) -> {
                System.out.println("Materie: " + materie.getNumeMaterie() + " - Nota: " + nota);
            });
            double media = Medie.calculareMedie(situatie);
            System.out.println("Media finală: " + media);
        }
    }
	
}
