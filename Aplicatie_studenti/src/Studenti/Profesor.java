package Studenti;

import java.util.*;


public class Profesor extends Persoana {
	private NumeMaterie numeMaterie;

    public Profesor(String nume, String prenume, String email, String parola, NumeMaterie numeMaterie) {
        super(nume, prenume, email, parola);
        this.numeMaterie = numeMaterie;
    }
    

}
