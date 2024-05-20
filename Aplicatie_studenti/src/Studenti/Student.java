package Studenti;

import java.util.*;

public class Student extends Persoana {
    private String grupa;
    private Map<Materie, Integer> situatie;

    public Student(String nume, String prenume, String email, String parola, String grupa) {
        super(nume, prenume, email, parola);
        this.grupa = grupa;
        this.situatie = new HashMap<>();
    }

    // Metodă pentru a obține media unei materii
    public Integer obtineMedia(Materie materie) {
        return this.situatie.get(materie);
    }

    // Metodă pentru a obține situația completă
    public Map<Materie, Integer> getSituatie() {
        return situatie;
    }

    // Getter și Setter pentru grupa
    public String getGrupa() {
        return grupa;
    }

    public void setGrupa(String grupa) {
        this.grupa = grupa;
    }

    // Metodă pentru a calcula media generală
    public double medieGenerala() {
        if (situatie.isEmpty()) {
            return 0;
        }
        int suma = 0;
        for (int media : situatie.values()) {
            suma += media;
        }
        return (double) suma / situatie.size();
    }

    // Metodă pentru a crea și trimite un feedback
    public Feedback creeazaFeedback(String detalii, Materie materie) {
        Profesor profesor = materie.getProfesor();
        Feedback feedback = new Feedback(detalii, this, profesor);
        feedback.trimiteFeedback();
        return feedback;
    }
}
