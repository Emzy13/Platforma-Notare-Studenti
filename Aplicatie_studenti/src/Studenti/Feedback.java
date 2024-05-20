package Studenti;

public class Feedback {
	private String detalii;
    private Student student;
    private Profesor profesor;

    public void trimiteFeedback() {
        System.out.println("Feedback trimis: " + this.detalii);
    }

    public void raspundeLaFeedback(String raspuns) {
        System.out.println("Răspunsul profesorului: " + raspuns);
    }
}
