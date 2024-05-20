package Studenti;

import java.util.ArrayList;
import java.util.List;

public class Profesor extends Persoana {
    private Materie materie;
    private List<Feedback> feedbackuri;

    public Profesor(String nume, String prenume, String email, String parola, Materie materie) {
        super(nume, prenume, email, parola);
        this.materie = materie;
        this.feedbackuri = new ArrayList<>();
    }

    // Getter și Setter pentru numeMaterie
    public String getNumeMaterie() {
        return materie.getNumeMaterie();
    }

    public void setMaterie(Materie materie) {
        this.materie = materie;
    }

    // Metodă pentru adăugarea unui feedback în lista feedbackurilor
    public void adaugaFeedback(Feedback feedback) {
        feedbackuri.add(feedback);
    }

    // Metodă pentru obținerea listei de feedback-uri
    public List<Feedback> getFeedbackuri() {
        return feedbackuri;
    }
}
