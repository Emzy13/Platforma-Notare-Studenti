package Studenti;

public class Feedback {
	private String detalii;
    private Student student;
    private Profesor profesor;

    public Feedback(String detalii, Student student, Profesor profesor) {
        this.detalii = detalii;
        this.student = student;
        this.profesor = profesor;
    }

    public String getDetalii() {
        return detalii;
    }

    public void setDetalii(String detalii) {
        this.detalii = detalii;
    }

    public Student getStudent() {
        return student;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void trimiteFeedback() {
        System.out.println("Feedback trimis: " + this.detalii);
    }

    public void raspundeLaFeedback(String raspuns) {
        System.out.println("Răspunsul profesorului: " + raspuns);
    }
}
