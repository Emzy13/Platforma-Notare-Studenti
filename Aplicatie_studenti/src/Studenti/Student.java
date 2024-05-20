package Studenti;

import java.util.*;

public class Student extends Persoana {
	private NumeMaterie numeMaterie;
	private String grupa;
	
    public Student(String nume, String prenume, String email, String parola, NumeMaterie numeMaterie) {
        super(nume, prenume, email, parola);
        this.numeMaterie = numeMaterie;
    }

	//public String getNume() {
		// TODO Auto-generated method stub
	//	return null;
	//}
}
