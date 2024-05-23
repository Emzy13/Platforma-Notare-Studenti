package Studenti;

import java.util.*;


public class Profesor extends Persoana {
	private Materie materie;
    private List<Feedback> feedbackuri;

    public Profesor(String nume, String prenume, String email, String parola, Materie materie) {
        super(nume, prenume, email, parola);
        this.materie = materie;
        this.feedbackuri = new ArrayList<>();
    }

    public Materie getMaterie() {
        return materie;
    }

    public void setMaterie(Materie materie) {
        this.materie = materie;
    }

    public void adaugaFeedback(Feedback feedback) {
        feedbackuri.add(feedback);
    }

    public List<Feedback> getFeedbackuri() {
        return feedbackuri;
    }

}
