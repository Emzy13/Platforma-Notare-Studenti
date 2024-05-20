package Studenti;
import java.util.Arrays;
import java.util.List;

public class Aplicatie {
	public static void main(String[] args) {
        // Creare instanțe pentru Profesori și Studenți
        Profesor profesor1 = new Profesor("Ion", "Popescu", "ion.popescu@univ.com", "prof1234");
        Student student1 = new Student("Ana", "Ionescu", "ana.ionescu@stud.com", "stud1234", "302");

        // Creare Materii și asocierea cu Medie
        Medie medieMatematica = new Medie();
        Materie matematica = new Materie(medieMatematica);
        profesor1.getMaterii().add(matematica);
        student1.getMaterii().add(matematica);

        // Creare Secretariat și introducerea notelor
        Secretara secretariat = new Secretara();
        secretariat.introduceNote(student1, matematica, 9.5);
        
        // Generarea de rapoarte
        Rapoarte raport = new Rapoarte();
        raport.genereazaRaportMaterii(Arrays.asList(matematica));
        raport.genereazaRaportProfesori(Arrays.asList(profesor1));

        // Managementul feedback-ului
        Feedback feedback = new Feedback("Cursul de matematica ar putea include mai multe exemple practice.", student1, profesor1);
        feedback.trimiteFeedback();
        feedback.raspundeLaFeedback("Mulțumesc pentru sugestie, voi include mai multe exemple în viitor.");

        // Verificare și aplicare pentru bursă
        Bursa bursa = new Bursa(student1);
        bursa.verificaEligibilitatea();
        bursa.aplicaPentruBursa();
    }
}
