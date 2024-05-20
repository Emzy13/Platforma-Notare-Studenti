package Studenti;

public class Persoana {
	private String nume;
    private String prenume;
    private String email;
    private String parola;

    public Persoana(String nume, String prenume, String email, String parola) {
        this.nume = nume;
        this.prenume = prenume;
        this.email = email;
        this.parola = parola;
    }
 // Getters
 	public String getNume() {
 	    return nume;
 	}
 	
 	public String getPrenume() {
 	    return prenume;
 	}
 	
 	public String getEmail() {
 	    return email;
 	}
 	
 	public String getParola() {
 	    return parola;
 	}
 	
 	// Setters
 	public void setNume(String nume) {
 	    this.nume = nume;
 	}
 	
 	public void setPrenume(String prenume) {
 	    this.prenume = prenume;
 	}
 	
 	public void setEmail(String email) {
 	    this.email = email;
 	}
 	
 	public void setParola(String parola) {
 	    this.parola = parola;
 	}
}
