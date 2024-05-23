package Studenti;

public class Materie {
	private String numeMaterie;
    Profesor profesor;

    public Materie(String numeMaterie, Profesor profesor) {
        this.numeMaterie = numeMaterie;
        this.profesor = profesor;
    }

    public String getNumeMaterie() {
        return numeMaterie;
    }

    public void setNumeMaterie(String numeMaterie) {
        this.numeMaterie = numeMaterie;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }
}
