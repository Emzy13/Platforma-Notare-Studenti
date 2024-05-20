package Studenti;

public class Feedback {
    private String detalii;
    private Student student;
    private Profesor profesor;

    // Constructor
    public Feedback(String detalii, Student student, Profesor profesor) {
        this.detalii = detalii;
        this.student = student;
        this.profesor = profesor;
    }

    // Getter pentru detalii
    public String getDetalii() {
        return detalii;
    }

    // Setter pentru detalii
    public void setDetalii(String detalii) {
        this.detalii = detalii;
    }

    // Getter pentru student
    public Student getStudent() {
        return student;
    }

    // Getter pentru profesor
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
