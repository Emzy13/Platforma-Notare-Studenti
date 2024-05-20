package Studenti;

public class Materie {
	private String numeMaterie;
    Profesor profesor;

    public Materie(String numeMaterie, Profesor profesor) {
        this.numeMaterie = numeMaterie;
        this.profesor = profesor;
    }

    // Getter pentru numeMaterie
    public String getNumeMaterie() {
        return numeMaterie;
    }

    // Setter pentru numeMaterie
    public void setNumeMaterie(String numeMaterie) {
        this.numeMaterie = numeMaterie;
    }

    // Getter pentru profesor
    public Profesor getProfesor() {
        return profesor;
    }

    // Setter pentru profesor
    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }
}
